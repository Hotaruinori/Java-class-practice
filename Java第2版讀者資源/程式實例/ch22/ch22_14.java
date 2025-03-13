import java.io.*;
public class ch22_14 {	
    public static void main(String args[]) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		String str = "str";								// 暫定字串內容
		System.out.println("輸入q則程式結束 ");
		while (!str.equals("q")) {						// q迴圈結束
			System.out.print("請輸入名字 : ");
			str = br.readLine();						// 讀取整行資料
			System.out.println("你的輸入是 : " + str);	// 輸出所讀取的資料	
		}
	}
}

