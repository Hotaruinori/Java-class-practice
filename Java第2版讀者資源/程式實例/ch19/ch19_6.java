import java.util.Scanner;						// 單類別匯入宣告
import static java.lang.Math.PI;				// 單靜態常數匯入宣告
public class ch19_6 {
	public static void main(String[] args) {
		double r;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入圓半徑 : ");
		r = scanner.nextDouble();				// 讀取半徑
		System.out.println("圓周長 : " + (2 * PI * r));		// 省略了Math.
	}
}

