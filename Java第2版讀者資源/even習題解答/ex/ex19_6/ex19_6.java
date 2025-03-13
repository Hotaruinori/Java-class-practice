import circles.*;						// 單類別匯入宣告
import java.util.Scanner;
public class ex19_6 {					
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);		
		System.out.print("請輸入圓半徑 : ");
		double r = scanner.nextDouble();				// 讀取半徑
		Cal obj = new Cal();		
		obj.area(r);
		obj.circumference(r);
	}
}

