import java.util.Scanner;
public class ch6_14 {
	public static void main(String[] args) {
		boolean  prime = true;					// 最初質數旗標是true
		int num;								// 輸入數字
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入大於1的整數做質數測試 : ");
		num = scanner.nextInt();
		if ( num == 2 )							// 2是質數
			System.out.printf("%d 是質數", num);
		else {
			for ( int i = 2; i < num; i++ ) {	// 測試從2至num-1
				if ( (num % i) == 0 ) {			// 可以整除就不是質數
					System.out.printf("%d 不是質數", num);
					prime = false;				// 更改質數旗標為false
					break;
				}
			}
			if ( prime )						// 如果質數旗標是true
				System.out.printf("%d 是質數", num);
		}
	}
} 

