import java.util.Scanner;
public class ch6_15 {
	public static void main(String[] args) {
		String msg, msg1, msg2, input_msg;
		char again;
		Scanner scanner = new Scanner(System.in);
		msg1 = "人機對話專欄,告訴我心事吧,我會重複你告訴我的心事!";
		msg2 = "輸入 q 可以結束對話 = ";
		msg = msg1 + '\n' + msg2;
		again = ' '; 							// 是否繼續字元,預設為空字元
		
		while ( again != 'q' ) {				// 如果是q則不執行迴圈		
			System.out.print(msg);				// 列出提示訊息
			input_msg = scanner.next();			// 讀取輸入字串
			System.out.println(input_msg);		// 列出所輸入訊息
			again = input_msg.charAt(0);		// 取得所輸入的第1個字元
		}
	}
} 

