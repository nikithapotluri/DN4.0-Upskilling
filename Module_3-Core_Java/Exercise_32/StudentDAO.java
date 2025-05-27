import java.sql.*;

public class StudentDAO {
    Connection conn;

    public StudentDAO() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "root");
    }

    public void insertStudent(int id, String name) throws SQLException {
        String query = "INSERT INTO students (id, name) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);
        stmt.setString(2, name);
        stmt.executeUpdate();
    }

    public void updateStudent(int id, String newName) throws SQLException {
        String query = "UPDATE students SET name=? WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, newName);
        stmt.setInt(2, id);
        stmt.executeUpdate();
    }
}
