import java.util.Scanner;
public class ch5_10 {
	public static void main(String[] args) {
		char ch;						
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("判斷輸入字元類別");
		System.out.print("請輸入任意字元 : ");
		ch = scanner.next().charAt(0);				// 讀取字元資料
		if (ch >= 'A' && ch <= 'Z') 	
			System.out.println("這是大寫字元");
		else if (ch >= 'a' && ch <= 'z')
			System.out.println("這是小寫字元");
		else if (ch >= '0' && ch <= '9')
			System.out.println("這是數字");
		else
			System.out.println("這是特殊字元");
	}
}

