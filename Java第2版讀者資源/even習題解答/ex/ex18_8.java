import java.util.Scanner;
public class ex18_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("請輸入整數資料 A : ");
		String A = scanner.next();
		System.out.printf("請輸入整數資料 B : ");
		String B = scanner.next();
		
		Integer a = Integer.parseInt(A);
		Integer b = Integer.parseInt(B);
		int c = a.compareTo(b);
		if (c == 0)
			System.out.println("A = B");
		else if (c == 1)
			System.out.println("A > B");
		else if (c == -1)
			System.out.println("A < B");
		else
			System.out.println("錯誤發生");
	}
}

