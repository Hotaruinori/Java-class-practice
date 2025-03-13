import myMath.*;								// 依需求類別宣告
import myMath.subMath.*;						// 依需求類別宣告
import myMath.subMath.divMath.*;				// 依需求類別宣告
import java.util.Scanner;
public class ex19_4 {					
	public static void main(String args[]){
		int x, y;
		Scanner scanner = new Scanner(System.in);		
		System.out.print("請輸入第1個整數 x : ");
		x = scanner.nextInt();				
		System.out.print("請輸入第2個整數 y : ");
		y = scanner.nextInt();			
		
		CalAdd obj1 = new CalAdd();
		CalSub obj2 = new CalSub();
		CalMul obj3 = new CalMul();
		CalDiv obj4 = new CalDiv();
		System.out.println("x + y = " + obj1.add(x, y));	// 執行加法運算
		System.out.println("x - y = " + obj2.sub(x, y));	// 執行減法運算
		System.out.println("x * y = " + obj3.mul(x, y));	// 執行乘法運算
		System.out.println("x / y = " + obj4.div(x, y));	// 執行整數除法運算
	}
}

