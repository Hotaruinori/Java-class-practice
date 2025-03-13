import java.util.Scanner;
public class ex4_4 {
	public static void main(String[] args) {
		int x;
		double y;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入小於10的整數 : ");
		x = scanner.nextInt();
		y = Math.pow(x, 2);
		System.out.printf("%d 的平方是 : %6.2f%n", x, y);
		y = Math.pow(x, 3);
		System.out.printf("%d 的立方是 : %6.2f%n", x, y);
	}
}

