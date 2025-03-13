import java.util.Scanner;
public class ch5_1 {
	public static void main(String[] args) {
		int age;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入年齡 : ");
		age = scanner.nextInt();			// 讀取年齡資料
		if (age < 20) {
			System.out.println("你的年齡太小");
			System.out.println("需滿20歲才可以購買菸酒");
		}
	}
}

