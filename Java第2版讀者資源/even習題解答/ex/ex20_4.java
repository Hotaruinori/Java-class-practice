import java.util.*;
public class ex20_4 {
	public static void main(String[] args) {
		int x1, x2;
		Scanner scanner = new Scanner(System.in);
		for ( ; ; ) {
			System.out.printf("請輸入2個整數(數字間用空白隔開) : ");
			try {
				x1 = scanner.nextInt();
				x2 = scanner.nextInt();
				System.out.println("數字除法結果是 : " + (x1 / x2));
			}
			catch(ArithmeticException e) {
				System.out.println("除數為0的異常" + e);
			}
			catch(InputMismatchException e) {
				System.out.println("輸入資料類型錯誤" + e);
				String str = scanner.nextLine(); 			// 讀取剩下錯誤字串
			}
			System.out.printf("是否繼續(y/n) : ");
			char ch = scanner.next().charAt(0);
			if (ch == 'n')
				break;
		}
		System.out.println("程式結束");
	}
}

