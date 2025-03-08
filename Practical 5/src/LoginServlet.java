import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "password".equals(password)) {
            RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
            request.setAttribute("username", username);
            rd.forward(request, response);
        } else {
            response.getWriter().println("<h2>Invalid Credentials</h2>");
        }
    }
}
