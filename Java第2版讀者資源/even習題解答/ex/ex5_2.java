import java.util.Scanner;
public class ex5_2 {
	public static void main(String[] args) {
		int tmp;
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("請輸入3個整數(數字間用空白隔開) : ");
		int x1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int x3 = scanner.nextInt();
		if (x1 < x2) {
			tmp = x1;
			x1 = x2;
			x2 = tmp;
		}
		if (x2 < x3) {
			tmp = x2;
			x2 = x3;
			x3 = tmp;
		}
		if (x1 < x2) {
			tmp = x1;
			x1 = x2;
			x2 = tmp;
		}
		System.out.printf("大到小分別是 %d, %d, %d%n", x1, x2, x3);
	}
}

