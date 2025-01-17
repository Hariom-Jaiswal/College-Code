import java.sql.*;

public class MySQLConnectionExample {
    public static void main(String[] args) {
        
        String jdbcURL = "jdbc:mysql://localhost:3306/try"; 
        String dbUsername = "root"; 
        String dbPassword = "root"; 

        
        try (Connection connection = DriverManager.getConnection(jdbcURL, dbUsername, dbPassword)) {
            System.out.println("Connected to MySQL database!");

            
            String insertQuery = "INSERT INTO users (name, rollno) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                preparedStatement.setString(1, "Hariom");
                preparedStatement.setString(2, "C029");
                preparedStatement.executeUpdate();
                System.out.println("Data inserted successfully!");
            }

            
            String selectQuery = "SELECT * FROM users";
            try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    System.out.println("Name: " + resultSet.getString("name"));
                    System.out.println("RollNo: " + resultSet.getString("rollno"));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
