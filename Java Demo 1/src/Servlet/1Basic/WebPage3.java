
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/doBasic")
public class WebPage3 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        out.print("<title>動態網頁(Servlet)</title>");
		out.print("<body text='green'>");
        String line="";
        
        //由大而小
        for(int x=1; x<=6; x++){
      	line="<h" + String.valueOf(x) + ">" + "Welcome</h" + String.valueOf(x) + ">"; 
          out.print(line);
        }
        
        //由小而大
        for(int x=6; x>=1; x--){
      	line="<h" + String.valueOf(x) + ">" + "Welcome</h" + String.valueOf(x) + ">"; 
          out.print(line);
        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
