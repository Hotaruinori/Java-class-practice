import java.util.Scanner;
public class ch20_2 {
	public static void main(String[] args) {
		int x;
		Scanner scanner = new Scanner(System.in);		
		System.out.print("請輸入整數 : ");
		x = scanner.nextInt();					// 讀取輸入
		for ( int i = 0; i < x; i++ ) {			// 這是外圈
			for ( int j = 0; j < x; j++ ) {		// 這是內圈
				System.out.print("*");			// 輸出符號
			}
			System.out.println();				// 換行輸出
		}
	}
}

