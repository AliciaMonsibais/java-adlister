import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet ("/count")
public class CounterServlet extends HttpServlet {
    private int count = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String reset = req.getParameter("reset");

        if("true".equals(reset)){
            count = 0;
        } else{
            count += 1;
        }
        resp.getWriter().println("<h1>Page number: " + count + "</h1>");
        resp.getWriter().println("<a href =\"/count?reset=true\">Reset</a>");
    }
}
