import java.util.Scanner;
public class ch5_16 {
	public static void main(String[] args) {
		int fruit, k;
		Scanner scanner = new Scanner(System.in);
		System.out.println("水果銷售");
		System.out.println("1:蘋果(20元/斤)	2:香蕉(18元/斤)	3:西瓜(10元/斤)");
		System.out.print("請輸入所選水果(1, 2或3) : ");	
		fruit = scanner.nextInt();					// 讀取所選水果
		System.out.print("請輸入購買幾斤 : ");	
		k = scanner.nextInt();						// 讀取購買幾斤									
		switch (fruit) {	
			case 1:
				System.out.println("總金額" + (k * 20));
				break;
			case 2:
				System.out.println("總金額" + (k * 18));
				break;
			case 3:
				System.out.println("總金額" + (k * 10));
				break;	
			default:
				System.out.println("水果選單錯誤");
		}
	}
}

