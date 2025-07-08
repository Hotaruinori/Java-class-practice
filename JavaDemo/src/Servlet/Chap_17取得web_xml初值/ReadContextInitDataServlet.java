
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/doReadInit")
public class ReadContextInitDataServlet extends HttpServlet {
	// insert code
	ServletConfig cfg;
	String web="";
	
	public void init(ServletConfig config) throws ServletException
	{
		super.init(config);
		this.cfg=config;
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// insert code
		ServletContext context=cfg.getServletContext();
		web=context.getInitParameter("webname");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.print("<h1>" + web + "</h1>");
	}
	
}