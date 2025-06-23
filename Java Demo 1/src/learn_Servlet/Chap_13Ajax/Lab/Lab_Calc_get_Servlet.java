
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/doCalc")
public class Lab_Calc_get_Servlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		float num1 = Float.parseFloat(request.getParameter("number1"));
		float num2 = Float.parseFloat(request.getParameter("number2"));
		String operator = request.getParameter("operator");
	    response.setContentType("text/html;charset=utf-8");
	    PrintWriter out=response.getWriter();
//	    out.print("test");
	    if(operator.equals("1")){
	    	out.print(num1 + num2);
	    }    
	  	else if(operator.equals("2")){
	        out.print(num1 - num2);
	    }
	  	else if(operator.equals("3")){
	        out.print(num1 * num2);
	    }	      
	    else if(operator.equals("4")){
	        out.print(num1 / num2);
	    }	
	    else {
	    	out.print("請選擇計算符號");
	    }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}
// Fetch API 新的方法