import java.lang.reflect.Method;

class Sample {
    public void greet() {
        System.out.println("Hello from greet()");
    }

    public void print(String msg) {
        System.out.println("Message: " + msg);
    }
}

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Sample");
        Object obj = cls.getDeclaredConstructor().newInstance();

        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
        }

        // Invoke methods
        Method greetMethod = cls.getMethod("greet");
        greetMethod.invoke(obj);

        Method printMethod = cls.getMethod("print", String.class);
        printMethod.invoke(obj, "Hello via Reflection");
    }
}
