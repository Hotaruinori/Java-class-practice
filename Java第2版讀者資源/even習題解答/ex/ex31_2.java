import java.io.*;
import java.net.*;
import java.util.Date;
public class ex31_2 {
    public static void main(String[] args) {
        if (args.length < 1) 
		return;
        int port = Integer.parseInt(args[0]); 		// port

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening 使用 port : " + port);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("新的 client connected");
                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);
                writer.println("現在時間 : " + new Date().toString());
            }
        } catch (IOException ex) {
            System.out.println("Server 異常發生 : " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}