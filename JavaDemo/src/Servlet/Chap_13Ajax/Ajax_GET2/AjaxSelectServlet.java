
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/doAjax")
public class AjaxSelectServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String select_op="";
	    select_op = request.getParameter("select_op");
	    response.setContentType("text/html;charset=utf-8");
	    PrintWriter out=response.getWriter();
	    
	    if(select_op.equals("1")){
	    	out.print("Choice 1");
	    }    
	  	else if(select_op.equals("2")){
	        out.print("Choice 2");
	    }
	  	else if(select_op.equals("3")){
	        out.print("Choice 3");
	    }	      
	    else{
	        out.print("Please choice one");
	    }	    
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}