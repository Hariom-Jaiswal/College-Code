import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionWelcomeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        String message = (session.isNew()) ? "Welcome Newcomer" : "Welcome Back";

        response.setContentType("text/html");
        response.getWriter().println("<h2>" + message + "</h2>");
    }
}
