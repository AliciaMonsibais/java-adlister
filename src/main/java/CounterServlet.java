import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet ("/count")
public class CounterServlet extends HttpServlet {
    private int counter = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String reset = req.getParameter("reset");

        if(reset == null){
            counter ++;
        } else {
            counter = 0;
            counter ++;
        }
        resp.getWriter().println("<h1>Site Visits: " + counter + "</h1>");
        resp.getWriter().println("<a href =\"/count?reset=true\">Reset</a>");
    }
}
