import java.util.*;
public class ch20_11 {
	public static void main(String[] args) {
		int x1, x2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入2個整數(數字間用空白隔開) : ");
		try {
			x1 = scanner.nextInt();
			x2 = scanner.nextInt();
			System.out.println("數字除法結果是 : " + (x1 / x2));
		}
		catch(ArithmeticException e) {					// 捕捉除數為0
			System.out.println("除數為0 : " + e);
		}
		catch(StringIndexOutOfBoundsException e) {		// 捕捉索引超出範圍
			System.out.println("字串超出索引" + e);
		}
		catch(RuntimeException e) {						// 捕捉其他所有異常				
			System.out.println("異常發生" + e);
		}
		System.out.println("ch20_11.java程式結束");
	}
}

