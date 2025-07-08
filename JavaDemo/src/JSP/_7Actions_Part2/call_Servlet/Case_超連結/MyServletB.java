
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.PrintWriter;

@WebServlet("/doMyServletB")
public class MyServletB extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out= response.getWriter(); 
        out.println("<h1 style='color:blue'><b><br>User:" + request.getParameter("user")+ "</b><h1>");
        
        HttpSession session=request.getSession();
        String no = (String)session.getAttribute("no");
        out.println("<h1 style='color:blue'><b>Employee number:" + no + "</b><h1>");
        
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}