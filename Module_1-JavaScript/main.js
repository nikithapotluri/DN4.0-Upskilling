// 1. JavaScript Basics & Setup
console.log("Welcome to the Community Portal");
window.onload = () => alert("Page is fully loaded!");

// 2. Syntax, Data Types, and Operators
const eventName = "Music Fest";
const eventDate = "2025-06-01";
let seatsAvailable = 50;
console.log(`Upcoming Event: ${eventName} on ${eventDate}. Seats Left: ${seatsAvailable}`);

// 3. Conditionals, Loops, and Error Handling
const allEvents = [
  { name: "Music Fest", date: "2025-06-01", category: "music", seats: 10 },
  { name: "Art Expo", date: "2024-05-01", category: "art", seats: 5 },
  { name: "Sports Meet", date: "2025-07-15", category: "sports", seats: 0 }
];

function displayValidEvents() {
  const now = new Date();
  allEvents.forEach(event => {
    const eventDate = new Date(event.date);
    if (eventDate > now && event.seats > 0) {
      console.log(`Valid Event: ${event.name}`);
    }
  });
}

function safeRegister(event) {
  try {
    if (event.seats <= 0) throw new Error("Event is full!");
    event.seats--;
    console.log(`Registered for ${event.name}. Remaining: ${event.seats}`);
  } catch (err) {
    console.error(err.message);
  }
}

// 4. Functions, Scope, Closures, Higher-Order Functions
function addEvent(name, date, category, seats) {
  allEvents.push({ name, date, category, seats });
}

function registerUser(eventName) {
  const event = allEvents.find(e => e.name === eventName);
  if (event) safeRegister(event);
}

function filterEventsByCategory(category) {
  return allEvents.filter(e => e.category === category);
}

function createCategoryCounter() {
  let count = 0;
  return () => ++count;
}

function filterWithCallback(cb) {
  return allEvents.filter(cb);
}

// 5. Objects and Prototypes
function Event(name, date, category, seats) {
  this.name = name;
  this.date = date;
  this.category = category;
  this.seats = seats;
}
Event.prototype.checkAvailability = function () {
  return this.seats > 0;
};
const sampleEvent = new Event("Dance Fest", "2025-08-01", "music", 5);
console.log(Object.entries(sampleEvent));

// 6. Arrays and Methods
allEvents.push({ name: "Baking Workshop", date: "2025-06-20", category: "workshop", seats: 15 });
const musicEvents = allEvents.filter(e => e.category === "music");
const formattedCards = allEvents.map(e => `${e.name} on ${e.date}`);

// 7. DOM Manipulation
const gallery = document.querySelector("#events");
function renderEvents() {
  const container = document.createElement("div");
  allEvents.forEach(e => {
    const card = document.createElement("div");
    card.className = "event-card";
    card.innerHTML = `<h4>${e.name}</h4><p>${e.date}</p><p>Category: ${e.category}</p><button onclick="registerUser('${e.name}')">Register</button>`;
    container.appendChild(card);
  });
  gallery.appendChild(container);
}

// 8. Event Handling
document.addEventListener("DOMContentLoaded", () => {
  const categorySelect = document.getElementById("eventType");
  categorySelect.onchange = () => {
    const filtered = filterEventsByCategory(categorySelect.value);
    console.log("Filtered Events:", filtered);
  };

  document.addEventListener("keydown", e => {
    if (e.key === "Enter") {
      console.log("Quick Search Triggered");
    }
  });
});

// 9. Async JS, Promises, Async/Await
function fetchEvents() {
  document.body.insertAdjacentHTML("beforeend", "<p id='loading'>Loading...</p>");
  fetch("https://jsonplaceholder.typicode.com/posts")
    .then(res => res.json())
    .then(data => {
      document.getElementById("loading").remove();
      console.log("Mock Events Loaded", data.slice(0, 3));
    })
    .catch(err => console.error("Failed to fetch:", err));
}
async function loadEventsAsync() {
  try {
    document.body.insertAdjacentHTML("beforeend", "<p id='loading'>Loading async...</p>");
    const res = await fetch("https://jsonplaceholder.typicode.com/posts");
    const data = await res.json();
    document.getElementById("loading").remove();
    console.log("Async Loaded:", data.slice(0, 3));
  } catch (err) {
    console.error("Async Error:", err);
  }
}

// 10. Modern JavaScript Features
function modernExample({ name, date, category }) {
  const newEvent = { ...{ name, date, category }, seats: 30 };
  console.log("Modern:", newEvent);
}

// 11. Working with Forms
const form = document.getElementById("eventForm");
if (form) {
  form.addEventListener("submit", e => {
    e.preventDefault();
    const { name, email } = form.elements;
    if (!name.value || !email.value) {
      alert("All fields required!");
    } else {
      console.log("Form Submitted:", name.value, email.value);
    }
  });
}

// 12. AJAX & Fetch API
function postRegistration(data) {
  setTimeout(() => {
    fetch("https://jsonplaceholder.typicode.com/posts", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(data)
    })
      .then(res => res.json())
      .then(json => alert("Registration Successful"))
      .catch(() => alert("Registration Failed"));
  }, 1000);
}

// 13. Debugging and Testing
function debugRegistration() {
  console.log("Debug: Submitting form");
  const payload = { user: "Test", event: "Demo Event" };
  console.log("Payload:", payload);
  fetch("https://jsonplaceholder.typicode.com/posts", {
    method: "POST",
    body: JSON.stringify(payload)
  }).then(res => console.log("Submitted:", res.status));
}

// 14. jQuery and JS Frameworks
// Include jQuery in HTML: <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
$(document).ready(() => {
  $("#registerBtn").click(() => alert("jQuery Register Clicked"));
  $(".event-card").fadeIn().fadeOut();
});


    function validatePhone(input) {
      const pattern = /^[0-9]{10}$/;
      if (!pattern.test(input.value)) {
        alert("Enter a valid 10-digit phone number.");
        input.focus();
      }
    }

    function showFee(select) {
      if (select.value) {
        alert("Event Fee: ₹" + (select.value === "sports" ? 100 : 50));
      }
    }

    function countCharacters(textarea) {
      document.getElementById("charCount").textContent = textarea.value.length;
    }

    function showConfirmation() {
      alert("Thank you! Your registration is being processed.");
    }

    function confirmSubmission(e) {
      e.preventDefault();
      document.getElementById("formResult").textContent = "Successfully Registered!";
    }

    function enlarge(img) {
      img.style.width = "250px";
    }

    function savePreference() {
      const type = document.getElementById("eventType").value;
      if (type) {
        localStorage.setItem("preferredEvent", type);
        alert("Event type saved!");
      }
    }

    function clearPreferences() {
      localStorage.clear();
      sessionStorage.clear();
      alert("Preferences cleared.");
    }

    window.onload = () => {
      const saved = localStorage.getItem("preferredEvent");
      if (saved) document.getElementById("eventType").value = saved;
    };

    function findLocation() {
      if (!navigator.geolocation) {
        document.getElementById("locationResult").textContent = "Geolocation is not supported.";
        return;
      }

      navigator.geolocation.getCurrentPosition(
        pos => {
          document.getElementById("locationResult").textContent =
            `Latitude: ${pos.coords.latitude}, Longitude: ${pos.coords.longitude}`;
        },
        err => {
          document.getElementById("locationResult").textContent = "Could not retrieve location.";
        },
        { enableHighAccuracy: true, timeout: 5000 }
      );
    }

    window.onbeforeunload = function () {
      if (document.getElementById("feedback").value !== "") {
        return "You have unsaved feedback. Are you sure you want to leave?";
      }
    };