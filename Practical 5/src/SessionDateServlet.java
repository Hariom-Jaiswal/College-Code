import java.io.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionDateServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        Date lastAccessTime = (Date) session.getAttribute("lastAccess");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Current Date: " + new Date() + "</h2>");

        if (lastAccessTime == null) {
            out.println("<h2>Welcome! This is your first visit.</h2>");
        } else {
            out.println("<h2>Last Access Date: " + lastAccessTime + "</h2>");
        }

        session.setAttribute("lastAccess", new Date());
    }
}
