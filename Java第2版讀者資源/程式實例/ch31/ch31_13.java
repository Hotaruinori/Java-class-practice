import java.net.*;											// 匯入類別庫	
import java.io.*;							
public class ch31_13 { 
	public static void main(String[] args) throws Exception { 
        int port = 2255;									// 接收端port
		byte[] buf = new byte[1024];						// byte陣列
		System.out.println("接收端程式執行中 ... ");
// 接收端端設計
		while (true) {
            DatagramSocket socket = new DatagramSocket(port);	// 建立socket
			DatagramPacket data = new DatagramPacket(buf,buf.length);			
			socket.receive(data);
			String msg = new String(buf,0,data.getLength());
            System.out.println("傳來的訊息 : " + msg);		// 輸出傳來的資料
			socket.close();
        }
	}
}
