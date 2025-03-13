import java.util.Scanner;
public class ch4_45 {
	public static void main(String[] args) {
		String x;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入姓名 : ");
		x = scanner.next();
		System.out.printf("嗨! %s 歡迎使用本系統", x);
	}
}

