import java.sql.*;

public class UpdateSalaryCallable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/EmployeeDB";
        String user = "root";
        String password = "root";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             CallableStatement stmt = conn.prepareCall("{CALL UpdateSalary()}")) {

            stmt.execute();
            System.out.println("Salaries updated successfully by 20%.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
