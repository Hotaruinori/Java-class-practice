import java.util.Scanner;
import java.util.regex.*;
public class ex13_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String pattern = new String();		// 正規表達式字串物件
		String str = new String();			// 測試字串物件
		System.out.print("請輸入正規表達式字串 : ");
		pattern = scanner.next();
			
		while (true) {	
			System.out.print("請輸入測試字串 : ");
			str = scanner.next();	
			System.out.println("比對結果 " + Pattern.matches(pattern, str));
			System.out.printf("是否繼續(y/n)? ");
			char torf = scanner.next().charAt(0);
			if (torf != 'y')
				break;
		}
	}
}

