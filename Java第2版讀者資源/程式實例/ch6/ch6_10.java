import java.util.Scanner;
public class ch6_10 {
	public static void main(String[] args) {
		final int pwd = 70;				// 密碼數字
		int num;						// 儲存所猜的數字
		Scanner scanner = new Scanner(System.in);
		
		for ( ; ; ) {					// 這是無限迴圈
			System.out.print("請猜0-99的數字 : ");
			num = scanner.nextInt();	// 讀取輸入數字
			if ( num == pwd ) {
				System.out.println("恭喜猜對了!!");
				break;
			}
			System.out.println("猜錯了請再答一次!");
		}
	}
}

