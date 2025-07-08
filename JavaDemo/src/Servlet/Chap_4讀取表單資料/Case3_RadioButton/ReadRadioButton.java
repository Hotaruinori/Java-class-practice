import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/read3")
public class ReadRadioButton extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String sport=request.getParameter("sport");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();

		String value="";
		if(sport!=null) {
			
			switch(sport) {
				case "1":
					value="打球";
					break;
				case "2":
					value="爬山";
					break;
				case "3":
					value="游泳";
					break;
				case "4":
					value="跳舞"; 			
			}
		}
		else
			value="未選取";

		out.println("<html><head><title>RadioButton</title></head>");
		out.println("<body>");
		out.print("<h2>你的選擇是</h2>");
		out.print("<h2>"+ value +"</h2>");
		out.print("</body></html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
