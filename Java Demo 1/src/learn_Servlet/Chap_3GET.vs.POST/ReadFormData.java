
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/doRead")
public class ReadFormData extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>GET</title></head>");
		out.println("<body>");
		out.println("<h1 style='color:green'>我是 doGet 方法</h1>");
		out.println("</body></html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>POSTT</title></head>");
		out.println("<body>");
		out.println("<h1 style='color:red'>I'm doPost method</h1>");
		out.println("</body></html>");
	}	
}
