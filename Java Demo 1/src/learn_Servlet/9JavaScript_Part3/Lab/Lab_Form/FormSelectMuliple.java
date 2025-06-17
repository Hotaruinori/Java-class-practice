
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.HashMap;
import java.util.Map;

@WebServlet("/checkForm")
public class FormSelectMuliple extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
		String[] musicSelect=request.getParameterValues("music");
		String[] name = {"搖滾音樂", "流行音樂", "爵士音樂", "古典音樂", "鄉村音樂", "民歌音樂"};
		
		StringBuilder temp = new StringBuilder();
		for(int i = 0; i < musicSelect.length ;i++) {
			temp.append(name[Integer.parseInt(musicSelect[i])-1]);
			if(i != musicSelect.length-1)temp.append("--");
		}
		
		String result = temp.toString();
		System.out.println(temp);
		PrintWriter out=response.getWriter();
		out.print("<html><head><title>ListBox</title></head></html>");
		out.print("<h1 style='color:blue'>我喜歡的音樂是：</br>" + result + "</h1>");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        doGet(request, response);
    }

	
}