import java.sql.*;

public class TransactionDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/EmployeeDB";
        String user = "root"; 
        String password = "root"; 
        Connection conn = null;
        PreparedStatement stmt1 = null, stmt2 = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
            conn.setAutoCommit(false); 
            
            stmt1 = conn.prepareStatement("UPDATE Employee SET salary = salary - 5000 WHERE emp_id = ?");
            stmt1.setInt(1, 1);
            stmt1.executeUpdate();

            stmt2 = conn.prepareStatement("UPDATE Employee SET salary = salary + 5000 WHERE emp_id = ?");
            stmt2.setInt(1, 2);
            stmt2.executeUpdate();

            
            conn.commit();
            System.out.println("Transaction successful: Salary transferred.");

        } catch (SQLException e) {
            try {
                if (conn != null) {
                    conn.rollback(); 
                    System.out.println("Transaction rolled back due to an error.");
                }
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (stmt1 != null) stmt1.close();
                if (stmt2 != null) stmt2.close();
                if (conn != null) conn.close();
            } catch (SQLException closeEx) {
                closeEx.printStackTrace();
            }
        }
    }
}
