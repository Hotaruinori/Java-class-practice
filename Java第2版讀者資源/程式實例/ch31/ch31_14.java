import java.net.*;											// 匯入類別庫	
import java.io.*;	
import java.util.Scanner;						
public class ch31_14 { 
	public static void main(String[] args) throws Exception { 
		Scanner scanner = new Scanner(System.in);
        int port = 2255;									// 接收端的port
		if (args.length < 1) {
			System.out.println("請輸入IP");
			return;
		}
		String receiverIP = args[0];						// 設定IP
		InetAddress addr = InetAddress.getByName(receiverIP);
// 傳送端的設計
		while (true) {
			System.out.print("訴說心聲 : ");
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			String txt = br.readLine();			// 讀取整行資料
			int txtLength = txt.length();		// 字串長度
			byte[] buf = new byte[txtLength];	// 建立指定長度的byte陣列
			buf = txt.getBytes();				// 將字串存成byte陣列
			DatagramPacket datagram = new DatagramPacket(buf,txtLength,addr,port);
			DatagramSocket socket = new DatagramSocket();
			if (txt.equalsIgnoreCase("quit"))
				break;
			socket.send(datagram);
			socket.close();
		}
	}
}

