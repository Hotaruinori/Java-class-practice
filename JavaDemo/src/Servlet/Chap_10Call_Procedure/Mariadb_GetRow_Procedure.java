import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Mariadb_GetRow_Procedure")
public class Mariadb_GetRow_Procedure extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        
        // 資料庫參數
        String sDriver = "org.mariadb.jdbc.Driver";
        String url = "jdbc:mariadb://localhost:3306/mydb";
        String acc = "root";
        String pwd = "1234";

        try {
            // 載入JDBC驅動程式
            Class.forName(sDriver);
            
            // 建立HTML表格開頭
            out.println("<html><head><title>員工資料</title></head><body>");
            out.println("<h2>員工資料列表</h2>");
            out.println("<table border='1'>");
            out.println("<tr><th>編號</th><th>姓名</th><th>地址</th></tr>");

            // 建立資料庫連接
            conn = DriverManager.getConnection(url, acc, pwd);
            stmt = conn.prepareCall("{ call getemployee() }");
            
            // 執行查詢
            rs = stmt.executeQuery();
            
            // 轉換資料庫內容到網頁上
            while(rs.next()) {
                out.println("<tr>");
                out.println("<td>" + rs.getString("NUM") + "</td>");
                out.println("<td>" + rs.getString("NAME") + "</td>");
                out.println("<td>" + rs.getString("ADDRESS") + "</td>");
                out.println("</tr>");
            }
            
            out.println("</table>");
            out.println("</body></html>");
            
        } catch (ClassNotFoundException e) {
            out.println("<p>無法載入資料庫驅動程式: " + e.getMessage() + "</p>");
            e.printStackTrace();
        } catch (SQLException e) {
            out.println("<p>資料庫操作錯誤: " + e.getMessage() + "</p>");
            e.printStackTrace();
        } finally {
            // 關閉資源
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}