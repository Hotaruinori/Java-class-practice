import java.util.Scanner;
public class ch13_4 {
	public static void main(String[] args) {
		String str = new String( );
		String pattern = "\\d\\d\\d\\d";	// 設定正規表達式
		Scanner scanner = new Scanner(System.in);		
		System.out.println("請輸入任意字串 : ");
		str = scanner.next();				// 以字串方式讀取輸入
		if (str.matches(pattern))			// 正規表達式比對
			System.out.printf("%s : 是4個0-9數字\n", str);
		else			
			System.out.printf("%s : 不是4個0-9數字\n", str);		
	}
}

