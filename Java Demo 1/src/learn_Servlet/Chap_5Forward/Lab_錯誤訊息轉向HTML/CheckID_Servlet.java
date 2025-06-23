
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/chkID")
public class CheckID_Servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String idinput=request.getParameter("id");
		
		
		PrintWriter out=response.getWriter();
		out.print("<h2>"+ "你輸入的身分證字號為"+idinput +"</h2>");
		
		boolean isValid = validateTaiwanID(idinput);
        if (isValid) {
            out.println("<h2 style='color:green'>身分證字號合法！</h2>");
        } else {
            out.println("<h2 style='color:red'>身分證字號不合法！</h2>");
            // 轉發到錯誤頁面
            RequestDispatcher dispatcher = request.getRequestDispatcher("errorPage.html");
            dispatcher.forward(request, response);
        }
			
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doGet(request, response);		
    }	
	

    public static boolean validateTaiwanID(String id) {
        // 身分證字號的正規表達式
        String regex = "^[A-Z][12]\\d{8}$";
        if (!id.matches(regex)) {
            System.err.println("身分證字號不符合格式！(英文需大寫)");
            return false; // 不符合格式
        }
        // 計算校驗碼
        return checkChecksum(id);
    }
    private static boolean checkChecksum(String id) {
        // 身分證字號的每個字母對應的數字
        String alphabet = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
        
        // 取得第一個字母的對應數字
        int firstLetterValue = alphabet.indexOf(id.charAt(0)) + 10;
        System.out.println("firstLetterValue: " + firstLetterValue);

        // 取得身分證的前9位數字
        String numberPart = id.substring(1);
        System.out.println("numberPart: " + numberPart);

        // 計算英文字首加權
        int sum = (firstLetterValue / 10) * 1 + (firstLetterValue % 10) * 9;
        System.out.println("英文字首計算: " + sum);

        // 計算後9個數字的權重
        //int sum2 = 0;
        for (int i = 0; i < 9; i++) {
            sum += (numberPart.charAt(i) - '0') * (8 - i);
        }
        sum += (numberPart.charAt(8) - '0');

        // 校驗碼必須為10的倍數
        System.out.println("sum校驗: " + sum);
        return sum % 10 == 0;
    }
}