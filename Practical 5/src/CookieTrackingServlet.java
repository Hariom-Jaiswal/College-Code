import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieTrackingServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cookie[] cookies = request.getCookies();
        int visitCount = 1;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(c.getValue()) + 1;
                }
            }
        }

        Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));
        response.addCookie(visitCookie);

        response.setContentType("text/html");
        response.getWriter().println("<h2>Welcome! You have visited " + visitCount + " times.</h2>");
    }
}
