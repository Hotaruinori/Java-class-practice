import java.util.Scanner;
public class ch5_9 {
	public static void main(String[] args) {
		double price;
		int age;
		int ticket = 100;						// 標準票價
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("計算票價");
		System.out.print("請輸入年齡 : ");
		age = scanner.nextInt();				// 讀取年齡資料
		if (age >= 80 || age <= 6) {
			price = ticket * 0.2;				// 計算打 2 折票價		
			System.out.print("票價是 : " + price);
		} else if (age >= 60 || age <= 12) {
			price = ticket * 0.5;				// 計算打 5 折票價
			System.out.print("票價是 : " + price);
		} else {
			price = ticket;						// 不打折票價
			System.out.print("票價是 : " + price);
		}
	}
}

