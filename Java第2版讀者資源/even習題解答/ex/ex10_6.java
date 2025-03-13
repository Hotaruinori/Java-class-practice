import java.util.Scanner;
public class ex10_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入第一個座標的緯度 : ");
		double x1 = scanner.nextDouble();					  
		System.out.print("請輸入第一個座標的經度 : ");
		double y1 = scanner.nextDouble();
		System.out.print("請輸入第二個座標的緯度 : ");
		double x2 = scanner.nextDouble();					  
		System.out.print("請輸入第二個座標的經度 : ");
		double y2 = scanner.nextDouble();
		double r = 6371;									// 地球半徑
		
		double d;
		d = r * Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+
		                  Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*
			              Math.cos(Math.toRadians(y1-y2)));
		
		System.out.println("distance = " + d);				
	}
}

