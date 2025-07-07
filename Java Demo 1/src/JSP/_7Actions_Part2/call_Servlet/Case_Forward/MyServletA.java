
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/doServletA")
public class MyServletA extends HttpServlet {

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
    	response.setContentType("text/html; charset=utf-8");
    	PrintWriter out= response.getWriter(); 
        out.print("<h2 style='color:#f0f'>進入doServletA</h2>");
        out.print("<h1 style='color:blue'><b>User:" + request.getParameter("user"));
        out.print(", Employee no:" + request.getParameter("empid") + "</b><h1>");

    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}