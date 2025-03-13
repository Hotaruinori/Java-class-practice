import java.net.*;											// 匯入類別庫	
import java.io.*;							
public class ch31_12 { 
	public static void main(String[] args){ 
        String hostname = "localhost";						// 這是本機執行
        int port = 2255;									// Server port
        try  {
// 建立連線
			Socket socket = new Socket(hostname, port);		// 建立socket
// 取得Server端資料
            InputStream input = socket.getInputStream();	// 建立input物件
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String line = reader.readLine();				// 讀取資料
            System.out.println(line);						// 輸出Server傳來的資料
        } catch (UnknownHostException ex) { 
            System.out.println("找不到Server : " + ex.getMessage());
        } catch (IOException ex) {
 
            System.out.println("I/O錯誤: " + ex.getMessage());
        }
	}
}


