import java.util.*;
public class ch20_20 {
	public static void myMethod() throws ArithmeticException, InputMismatchException {
		Scanner scanner = new Scanner(System.in);
		int x1, x2;
		System.out.println("請輸入2個整數(數字間用空白隔開) : ");
		x1 = scanner.nextInt();								// 	讀取第1個數字
		x2 = scanner.nextInt();								// 	讀取第2個數字
		System.out.println("數字除法結果是 : " + (x1 / x2));
	}
	public static void main(String[] args) {		
		try {
			myMethod();										// 可能發生異常的敘述
		}
		catch(ArithmeticException e) {						// 除數為0的異常
			System.out.println("除數為0的異常" + e);
		}
		catch(InputMismatchException e) {					// 資料錯誤的異常
			System.out.println("輸入資料類型錯誤" + e);
		}
	}
}

