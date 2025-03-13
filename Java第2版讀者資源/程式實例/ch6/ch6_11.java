import java.util.Scanner;
public class ch6_11 {
	public static void main(String[] args) {
		final int pwd = 70;				// 密碼數字		
		int count = 1;					// 計算所猜的次數
		int num;						// 儲存所猜的數字
		Scanner scanner = new Scanner(System.in);
		
		while ( count <= 5 ) {			// 最多可以猜5次
			System.out.print("請猜0-99的數字 : ");
			num = scanner.nextInt();	// 讀取輸入數字
			if ( num == pwd ) {
				System.out.println("恭喜猜對了!!");
				break;
			}
			if ( count == 5 )			// 依猜測次數輸出字串
				System.out.println("最多只能猜5次, bye!");
			else
				System.out.println("猜錯了請再答一次!");
			count++;					// 將while迴圈變數加1
		}
	}
}

