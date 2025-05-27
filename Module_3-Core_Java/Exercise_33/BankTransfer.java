import java.sql.*;

public class BankTransfer {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "root")) {
            conn.setAutoCommit(false);

            try {
                PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
                debit.setInt(1, 100);
                debit.setInt(2, 1);
                debit.executeUpdate();

                PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");
                credit.setInt(1, 100);
                credit.setInt(2, 2);
                credit.executeUpdate();

                conn.commit();
                System.out.println("Transfer successful.");
            } catch (SQLException e) {
                conn.rollback();
                System.out.println("Transfer failed. Rolled back.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
