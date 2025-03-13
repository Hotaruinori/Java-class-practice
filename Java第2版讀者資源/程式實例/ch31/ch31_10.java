import java.net.*;											// 匯入類別庫	
import java.io.*;							
public class ch31_10 { 
	public static void main(String[] args){ 
        String outstr = "google.com"; 						// 要送至Server的資料
        String hostname = "whois.internic.net";				// Server網址
        int port = 43;										// Server port
        try  {
// 建立連線
			Socket socket = new Socket(hostname, port);		// 建立socket
// 傳送資料給Server			
            OutputStream output = socket.getOutputStream();	// 建立output物件
            PrintWriter writer = new PrintWriter(output, true);
            writer.println(outstr);							// 送出資料
// 取得Server端資料
            InputStream input = socket.getInputStream();	// 建立input物件
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String line;
            while ((line = reader.readLine()) != null) {	// 讀取Server傳來的資料
                System.out.println(line);					// 輸出Server傳來的資料
            }
        } catch (UnknownHostException ex) { 
            System.out.println("找不到Server : " + ex.getMessage());
        } catch (IOException ex) {
 
            System.out.println("I/O錯誤: " + ex.getMessage());
        }
	}
}


