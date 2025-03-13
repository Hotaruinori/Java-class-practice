import java.util.Scanner;
public class ex6_4 {
	public static void main(String[] args) {
		int i;				
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("請輸入存款本金 : ");
		double money = scanner.nextDouble();	
		System.out.print("請輸入存款年數 : ");
		int year = scanner.nextInt();
		System.out.print("請輸入存款年利率 : ");
		double rate = scanner.nextDouble();
		
		for (i = 1; i <= year; i++){
			money = money * (1 + rate);
			System.out.printf("第 %d 年本金和 %8.1f%n", i, money);
		}
	}
}

