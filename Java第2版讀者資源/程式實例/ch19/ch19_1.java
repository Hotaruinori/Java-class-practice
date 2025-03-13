import java.util.Scanner;						// 單類別匯入聲明
public class ch19_1 {
	public static void main(String[] args) {
		double r;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入圓半徑 : ");
		r = scanner.nextDouble();				// 讀取半徑
		System.out.println("圓周長 : " + (2 * Math.PI * r));
	}
}

