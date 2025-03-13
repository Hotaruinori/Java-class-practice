import java.util.Scanner;
public class ch10_4 {
	public static void main(String[] args) {
		int[] lottery = new int[50];
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入購買大樂透卷數量 : ");
		int num = scanner.nextInt();					// 讀取購買大樂透卷數量
		
		for ( int i = 1; i <= num; i++) {				// 處理購買大樂透卷數量		
			System.out.printf("%d : \t", i);			// 輸出第幾組大樂透資料
			for ( int n = 1; n <= 49; n++)				// 處理lottery[n]=n, n = 1-49
				lottery[n] = n;
			int counter = 1;							// 各組大樂透數字編號
			while ( counter <= 6 ) {					// 一組大樂透有6個數字
				int lotteryNum = (int) (Math.random() * (49 - 1 + 1)) + 1;	// 產生大樂透號碼
				if (lottery[lotteryNum] == 0)			// 如果是0表示此數字已經產生
					continue;							// 返回while迴圈
				else {
					System.out.printf("%d  \t", lotteryNum);	// 產生新的大樂透數字
					lottery[lotteryNum] = 0;			// 將此陣列索引設為0
					counter++;							// 將大樂透數字編號加1
				}
			}
			System.out.printf("\n");					// 換行輸出
		}
	}
}

