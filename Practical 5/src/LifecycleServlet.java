import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LifecycleServlet extends HttpServlet {
    public void init() throws ServletException {
        System.out.println("Servlet Initialized");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Servlet Life Cycle Demo</h2>");
        System.out.println("Service Method Called");
    }

    public void destroy() {
        System.out.println("Servlet Destroyed");
    }
}
