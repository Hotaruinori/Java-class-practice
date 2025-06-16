

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/lab2")
public class Servlet_lab2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String num1str=request.getParameter("number1");
		String num2str=request.getParameter("number2");
		String calc = request.getParameter("operator");
		int num1 = Integer.parseInt(num1str);
        int num2 = Integer.parseInt(num2str);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>計算結果</title></head>");
		out.print("<span style=\"font-size: 3rem;\">計算結果:</span>");
//		out.println("<span style=\"font-size: 3rem;\">"+ num1 +"</span>");
//		out.println("<span style=\"font-size: 3rem;\">"+ num2 +"</span>");
//		out.println("<span style=\"font-size: 3rem;\">"+ calc +"</span>");
		int result = 0;
		switch(calc) {
        case "add":
            result = num1 + num2;
            break;
        case "sub":
            result = num1 - num2;
            break;
        case "mul":
            result = num1 * num2;
            break;
        case "div":
        	  if (num2 == 0) {
                  out.print("錯誤：除數不能為零");
                  return;
              }
        	 result = num1 / num2;
             break;
		}
		out.print("<span style=\"font-size: 3rem;\">"+ result +"</span>");
		out.println("</body></html>");
		out.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
