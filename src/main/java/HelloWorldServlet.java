
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "HelloWorldServlet", urlPatterns="/hello")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        if (name == null){
            name = "No One";
        }

        out.println("<h1 style=\"font-family: cursive;\">Hello, " + name + "!</h1>");
        out.println("<p>Enter your name: </p>");
        out.println("<form action=\"/hello\">");
        out.println("<input name=\"name\"/>");
        out.println("</form>");

        out.println("<h1>Hello, World!</h1>");
    }
}
