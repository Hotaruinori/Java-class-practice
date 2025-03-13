import java.io.*;
public class ch22_17 {	
    public static void main(String args[]) {
		Console cs = System.console();
		cs.printf("請輸入帳號 : ");				// 提示訊息
		String account = cs.readLine( );		// 讀取帳號
		cs.printf("%s 歡迎回來!", account);		// 輸出歡迎詞
	}
}

