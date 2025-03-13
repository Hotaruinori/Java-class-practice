import java.util.Scanner;
public class ch5_8 {
	public static void main(String[] args) {
		int score;
		Scanner scanner = new Scanner(System.in);
		System.out.println("計算最終成績");
		System.out.print("請輸入分數 : ");
		score = scanner.nextInt();				// 讀取成績資料
		if (score >= 90)
			System.out.println("A");
		else if (score >= 80)
			System.out.println("B");
		else if (score >= 70)
			System.out.println("C");
		else if (score >= 60)
			System.out.println("D");
		else 
			System.out.println("F");
	}
}

