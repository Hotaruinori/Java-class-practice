import java.io.*;
public class ch22_13 {	
    public static void main(String args[]) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.print("請輸入名字 : ");
		String name = br.readLine();			// 用讀取整行資料讀取名字
		System.out.println(name + "歡迎你");	// 輸出歡迎訊息		
	}
}

