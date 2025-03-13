import java.io.*;
public class ex22_4 {	
    public static void main(String args[]) {
		String account = "cshung";
		String pwd = "010101";
		
		Console cs = System.console();
		cs.printf("請輸入帳號 : ");					// 提示訊息
		String acc = cs.readLine();					// 讀取密碼
		
		cs.printf("請輸入密碼 : ");					// 提示訊息
		char[] ch = cs.readPassword();				// 讀取密碼
		String pw = String.valueOf(ch);				// 字元陣列轉成字串
		
		if (account.equals(acc))
			if (pwd.equals(pw))
				cs.printf("歡迎進入Java系統");
			else
				cs.printf("密碼錯誤");
		else
			cs.printf("帳號錯誤");
	}
}

