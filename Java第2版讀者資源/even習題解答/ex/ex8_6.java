import java.util.Scanner;
public class ex8_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("請輸入分數 : ");
		int score = scanner.nextInt();
		grade(score);
	}
	public static void grade(int sc) {
		if ( sc >= 90 )
			System.out.println("A");
		else if (sc >= 80)
			System.out.println("B");
		else if (sc >= 70)
			System.out.println("C");
		else if (sc >= 60)
			System.out.println("D");
		else
			System.out.println("F");
	}
}

