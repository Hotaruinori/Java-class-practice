import java.util.*;										// 依需求匯入類別宣告
public class ch19_3 {
	public static void main(String[] args) {
		Random ran = new Random();						// 屬於java.util.Random
		int pwd = ran.nextInt(10);						// 產生0-9間的目標數字
		int num;										// 儲存所猜數字
		Scanner scanner = new Scanner(System.in);		// 屬於java.util.Scanner
		
		for ( ; ; ) {									// 這是無限迴圈
			System.out.print("請猜0-9的數字 : ");
			num = scanner.nextInt();					// 讀取輸入數字
			if ( num == pwd ) {							// 如果猜對
				System.out.println("恭喜猜對了!!");
				break;
			}
			if ( num > pwd ) 							// 提示使用者猜數字方向
				System.out.println("猜錯了請猜小一點!!");
			else 
				System.out.println("猜錯了請猜大一點!!");
		}
	}
}

