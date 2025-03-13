import java.util.Scanner;						// 單類別匯入宣告
import static java.lang.Math.PI;				// 單靜態變數匯入宣告
import static java.lang.System.in;				// 單靜態變數in匯入宣告
import static java.lang.System.out;				// 單靜態變數out匯入宣告
public class ch19_9 {
	public static void main(String[] args) {
		double r;
		Scanner scanner = new Scanner(in);		// in取代System.in
		
		out.print("請輸入圓半徑 : ");			// out取代System.out
		r = scanner.nextDouble();				// 讀取半徑
		out.println("圓周長 : " + (2 * PI * r));// out取代System.out
	}
}

