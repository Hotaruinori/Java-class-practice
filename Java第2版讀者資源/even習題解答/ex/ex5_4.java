import java.util.Scanner;
public class ex5_4 {
	public static void main(String[] args) {
		final int hourPay = 150;
		double salary;
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("請輸入本週工作時數 : ");
		int hours = scanner.nextInt();
		if (hours < 40)
			salary = hours * hourPay * 0.8;
		else if (hours == 40)
			salary = hours * hourPay;
		else if (hours > 40 && hours <= 50)
			salary = hours * hourPay * 1.2;
		else
			salary = hours * hourPay * 1.6;
		System.out.printf("本週薪資 : " + salary);
	}
}

