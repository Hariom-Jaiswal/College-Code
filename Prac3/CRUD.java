package Prac3;
import java.sql.*;

public class CRUD {

    private Connection con = null; 
    private Statement st;
    private ResultSet rs;
    String Query;

    public void connect(){
        String jdbcURL = "jdbc:mysql://localhost:3306/CRUD";
        String username = "root";
        String password = "root";
        try {
            con = DriverManager.getConnection(jdbcURL, username, password);
            st = con.createStatement();
            System.out.println("Successful");
        } catch (Exception e){
            System.out.println("Error");
        }
    }

    public void createTable(){
        String createTable = "CREATE TABLE users ("
        + "id INT AUTO_INCREMENT PRIMARY KEY, "
        + "name VARCHAR(25),"
        + "email VARCHAR(20)"
        + ");";
        try {
            st.executeUpdate(createTable);
        } catch (SQLException e) {
            System.out.println("Error While Adding");
        }
        
    }

    public void insert(){
        Query = "INSERT INTO users (name, email) VALUES (\"Anshika\", \"abc@gmail.com\")";
        try {
            st.executeUpdate(Query);
        } catch (SQLException e) {
            System.out.println("Error While Adding");
        }
    }
    
    public void read(){
        Query = "SELECT * FROM users";
        try {
            rs = st.executeQuery(Query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                
                System.out.println("ID: "+ id + " Name: "+ name + " Email: "+ email);
            }
        } catch (SQLException e) {
            System.out.println("Error While Viewing");
        }
    }

    public void delete(){
        Query = "DELETE FROM users WHERE name=\"Anshika\"";
        try {
            st.executeUpdate(Query);
        } catch (SQLException e) {
            System.out.println("Error While Deleting");
        }
    }

    public static void main(String[] args) {
        CRUD x = new CRUD();
        x.connect();
        x.insert();
        x.read();
    }
}
