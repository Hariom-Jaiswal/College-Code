import java.sql.*;

public class SQL {

    private Connection con = null; 
    private Statement st;
    String Query;

    public void connect(){
        String jdbcURL = "jdbc:mysql://localhost:3306/library";
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

    public void add(){
        Query = "INSERT INTO admin (Librarian) VALUES (\"Hari\")";
        try {
            st.executeUpdate(Query);
        } catch (SQLException e) {
            System.out.println("Error While Adding");
        }
    }
    
    public void view(){
        Query = "SELECT * FROM admin";
        try {
            st.executeQuery(Query);
        } catch (SQLException e) {
            System.out.println("Error While Viewing");
        }
    }

    public void delete(){
        Query = "DELETE FROM admin WHERE Librarian=\"Hari\"";
        try {
            st.executeUpdate(Query);
        } catch (SQLException e) {
            System.out.println("Error While Deleting");
        }
    }

    public void addBooks(){
        Query = "";
        try {
            st.executeUpdate(Query);
        } catch (SQLException e) {
            System.out.println("Error While Deleting");
        }
    }

    public void viewBooks(){
        Query = "";
        try {
            st.executeUpdate(Query);
        } catch (SQLException e) {
            System.out.println("Error While Deleting");
        }
    }

    public void issueBooks(){
        Query = "";
        try {
            st.executeUpdate(Query);
        } catch (SQLException e) {
            System.out.println("Error While Deleting");
        }
    }

    public void viewIssued(){
        Query = "";
        try {
            st.executeUpdate(Query);
        } catch (SQLException e) {
            System.out.println("Error While Deleting");
        }
    }

    public void returnBooks(){
        Query = "";
        try {
            st.executeUpdate(Query);
        } catch (SQLException e) {
            System.out.println("Error While Deleting");
        }
    }

    public void close(){
        try {
            con.close();
            System.out.println("Connection Closed");
        } catch (SQLException e) {
            System.out.println("Error While closing");
        }
    }
}
