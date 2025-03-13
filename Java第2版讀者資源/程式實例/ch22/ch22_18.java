import java.io.*;
public class ch22_18 {	
    public static void main(String args[]) {
		Console cs = System.console();
		cs.printf("請輸入密碼 : ");					// 提示訊息
		char[] ch = cs.readPassword();				// 讀取密碼
		String pwd = String.valueOf(ch);			// 字元陣列轉成字串
		cs.printf("你所輸入的密碼是 : %s", pwd);	// 輸出密碼
	}
}

