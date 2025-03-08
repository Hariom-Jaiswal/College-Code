import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ConfigContextServlet extends HttpServlet {
    private String configParam;

    public void init(ServletConfig config) {
        configParam = config.getInitParameter("configParam");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ServletContext context = getServletContext();
        String globalParam = context.getInitParameter("globalParam");

        response.getWriter().println("<h2>Config Param: " + configParam + "</h2>");
        response.getWriter().println("<h2>Context Param: " + globalParam + "</h2>");
    }
}
