import java.net.*;											// 匯入類別庫	
import java.io.*;
import java.util.*;							
public class ch31_11 { 
	public static void main(String[] args){ 
        int port = 2255;									// Server port
        try  {
// Server端的設計
			ServerSocket serverSocket = new ServerSocket(port);
			System.out.println("Server服務程式正在傾聽 port " + port);
			while (true) {
				Socket socket = serverSocket.accept();		
				System.out.println("Server與Client端連線成功"); 
				OutputStream output = socket.getOutputStream();
				PrintWriter writer = new PrintWriter(output, true);
				writer.println("現在日期" + new Date().toString());
			}
        } catch (IOException ex) { 
            System.out.println("I/O錯誤: " + ex.getMessage());
        }
	}
}


