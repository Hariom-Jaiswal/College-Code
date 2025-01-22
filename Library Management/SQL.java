import java.sql.*;

public class SQL {

    private Connection con = null; 
    private Statement st;
    private ResultSet rs;
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
        Query = "INSERT INTO admin (Librarian) VALUES (\"Anshika\")";
        try {
            st.executeUpdate(Query);
            System.out.println("Added");
        } catch (SQLException e) {
            System.out.println("Error While Adding");
        }
    }
    
    public void view(){
        Query = "SELECT * FROM admin";
        try {
            rs = st.executeQuery(Query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("Librarian");

                System.out.println("ID: " + id + " Name: " + name );
            }
        } catch (SQLException e) {
            System.out.println("Error While Viewing");
        }
    }

    public void delete(){
        Query = "DELETE FROM admin WHERE Librarian=\"Anshika\"";
        try {
            st.executeUpdate(Query);
            System.out.println("Deleted");
        } catch (SQLException e) {
            System.out.println("Error While Deleting");
        }
    }

    public void addBooks(){
        Query = "INSERT INTO Librarian (Books, Status) VALUES (\"Harry Potter\", \"Available\")";
        try {
            st.executeUpdate(Query);
            System.out.println("Books Added");
        } catch (SQLException e) {
            System.out.println("Error While Adding");
        }
    }

    public void viewBooks(){
        Query = "SELECT * FROM Librarian";
        try {
            rs = st.executeQuery(Query);

            while (rs.next()) {
                int id = rs.getInt("ID");
                String books = rs.getString("Books");
                String status = rs.getString("Status");

                System.out.println("ID: " + id + " Books: " + books + " Status: " + status);
            }
        } catch (SQLException e) {
            System.out.println("Error While Viewing");
        }
    }

    public void issueBooks(){
        Query = "Update Librarian Set Status = \"Issued\" where books = \"harry Potter\" ";
        try {
            st.executeUpdate(Query);
            System.out.println("Issued");
        } catch (SQLException e) {
            System.out.println("Error While Issuing");
        }
    }

    public void viewIssued(){
        Query = "SELECT * FROM Librarian where Status=\"Issued\" ";
        try {
            rs = st.executeQuery(Query);

            while (rs.next()) {
                int id = rs.getInt("ID");
                String books = rs.getString("Books");
                String status = rs.getString("Status");

                System.out.println("ID: " + id + " Books: " + books + " Status: " + status);
            }
        } catch (SQLException e) {
            System.out.println("Error While Viewing");
        }
    }

    public void returnBooks(){
        Query = "Update Librarian Set Status = \"Returned\" where books = \"harry Potter\" ";
        try {
            st.executeUpdate(Query);
            System.out.println("returned");
        } catch (SQLException e) {
            System.out.println("Error While Returning");
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
