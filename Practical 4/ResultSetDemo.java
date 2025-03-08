import java.sql.*;

public class ResultSetDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/EmployeeDB";
        String user = "root"; 
        String password = "root"; 

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery("SELECT * FROM Employee")) {

            
            rs.last();
            System.out.println("Total Employees: " + rs.getRow());

            
            rs.beforeFirst();

            
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("emp_id") +
                        ", Name: " + rs.getString("emp_name") +
                        ", Department: " + rs.getString("department") +
                        ", Salary: " + rs.getDouble("salary") +
                        ", Joining Date: " + rs.getDate("joining_date"));
            }

            
            rs.absolute(3);
            System.out.println("Third Employee: " + rs.getString("emp_name"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
