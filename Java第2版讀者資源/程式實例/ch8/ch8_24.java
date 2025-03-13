import java.util.Scanner;
public class ch8_24 {
	public static void hannoi(int discNum, char from, char buffer, char to) {
		if (discNum == 1) {								// 遞迴呼叫的中止條件
			System.out.printf("將碟子從 %C ", from);
			System.out.printf("移動到 %C \n", to);
		}
		else {											
			hannoi(discNum-1, from, to, buffer);		// 將上方discNum-1圓盤由A移動到B
			System.out.printf("將碟子從 %C ", from);
			System.out.printf("移動到 %C \n", to);
			hannoi(discNum-1, buffer, from, to);		// 將上方discNum-1圓盤由B移動到C
		}
	}
	public static void main(String[] args) {
		int discNum;
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入圓盤數量 : ");
		discNum = scanner.nextInt();
		hannoi(discNum, 'A', 'B', 'C');
	}
}
 
