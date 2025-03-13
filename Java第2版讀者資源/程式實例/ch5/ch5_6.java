import java.util.Scanner;
public class ch5_6 {
	public static void main(String[] args) {
		int x;
		Scanner scanner = new Scanner(System.in);
		System.out.println("輸出絕對值的應用");
		System.out.print("請輸入任意整數 : ");
		x = scanner.nextInt();		// 讀取螢幕輸入
		if (x > 0) 
			System.out.println("絕對值是" + x);
		else
			System.out.println("絕對值是" + -x);
	}
}

