<%@ page import="java.sql.*" %>
<%
    String uname = request.getParameter("username");
    String pass = request.getParameter("password");

    boolean isValid = false;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");
        PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
        ps.setString(1, uname);
        ps.setString(2, pass);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            isValid = true;
        }
        con.close();
    } catch (Exception e) {
        out.println("Database Error: " + e.getMessage());
    }

    if (isValid) {
        request.getRequestDispatcher("menu.jsp").forward(request, response);
    } else {
        request.getRequestDispatcher("msg.jsp").forward(request, response);
    }
%>
