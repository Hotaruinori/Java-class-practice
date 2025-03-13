import java.time.*;
import java.util.*;
public class ch11_15 {
	public static void main(String[] args) {
		Instant from, to;					// 紀錄時間開始與結束
		final int pwd = 70;					// 密碼數字
		int num;							// 儲存所猜的數字
		Scanner scanner = new Scanner(System.in);
		from = Instant.now();				// 紀錄時間開始
		for ( ; ; ) {						// 這是無限迴圈
			System.out.print("請猜0-99的數字 : ");
			num = scanner.nextInt();		// 讀取輸入數字
			if ( num == pwd ) {
				System.out.println("恭喜猜對了!!");
				to = Instant.now();			// 紀錄時間結束
				break;
			}
			System.out.println("猜錯了請再答一次!");
		}
		Duration dura = Duration.between(from, to);
		System.out.println("所花時間總天數 " + dura.toDays());
		System.out.println("所花時間小時數 " + dura.toHours());
		System.out.println("所花時間分鐘數 " + dura.toMinutes());
		System.out.println("所花時間總秒數 " + dura.toSeconds());
		System.out.println("所花時間毫秒數 " + dura.toMillis());
		System.out.println("所花時間奈秒數 " + dura.toNanos());		
	}
}

