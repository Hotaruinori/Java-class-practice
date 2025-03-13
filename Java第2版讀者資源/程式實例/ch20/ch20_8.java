import java.util.*;
public class ch20_8 {
	public static void main(String[] args) {
		int x1, x2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入2個整數(數字間用空白隔開) : ");
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
		}
		System.out.println("ch20_8.java程式結束");
	}
}

