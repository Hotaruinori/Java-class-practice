import java.util.*;
public class ch11_3 {
	public static void main(String[] args) {
		long startDate, endDate;			// 紀錄時間開始與結束
		final int pwd = 70;					// 密碼數字
		int num;							// 儲存所猜的數字
		Scanner scanner = new Scanner(System.in);
		startDate = System.currentTimeMillis();			// 紀錄時間開始
		for ( ; ; ) {						// 這是無限迴圈
			System.out.print("請猜0-99的數字 : ");
			num = scanner.nextInt();		// 讀取輸入數字
			if ( num == pwd ) {
				System.out.println("恭喜猜對了!!");
				endDate = System.currentTimeMillis();	// 紀錄時間結束
				break;
			}
			System.out.println("猜錯了請再答一次!");
		}
		System.out.printf("所花時間 %d 毫秒", (endDate-startDate));
	}
}

