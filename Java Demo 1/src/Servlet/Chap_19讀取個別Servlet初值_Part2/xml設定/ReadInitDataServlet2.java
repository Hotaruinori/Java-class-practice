
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/doReadInit")
public class ReadInitDataServlet2 extends HttpServlet {

	String ver="", date="";
	
	public void init(ServletConfig config) throws ServletException
	{
		super.init(config);
		ver=config.getInitParameter("version");
		date=this.getInitParameter("date");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<h1 style='font-size:1cm'>");
		out.println("Servlet版本:"+ver+" , 建立日期:"+date);
		out.println("</h1>");
	}

}
