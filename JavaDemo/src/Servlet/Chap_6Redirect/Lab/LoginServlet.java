
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

@WebServlet("/doLogin")
public class LoginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println(username);
		System.out.println(password);

        if (isValidUser(username, password)) {
        	System.out.println("登入成功");
            response.sendRedirect("welcome.html");
        } else {
        	response.sendRedirect("login.html");
        	System.out.println("登入失敗");
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        doGet(request, response);
    }

    private static Map<String, String> user_login_data = new HashMap<>();
    static {
        // 初始化時載入帳密
    	user_login_data.put("admin", "admin");
    	user_login_data.put("user1", "user1");
    	user_login_data.put("user2", "user2");
    }
    
    // 驗證用戶方法
    private boolean isValidUser(String username, String password) {
        if (username == null || password == null||user_login_data.get(username) == null) {
            return false;
        }
        return user_login_data.get(username).equals(password);
    }
    		
}