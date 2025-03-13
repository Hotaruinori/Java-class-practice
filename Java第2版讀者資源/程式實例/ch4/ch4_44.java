import java.util.Scanner;
public class ch4_44 {
	public static void main(String[] args) {
		int x1, x2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入2個整數(數字間用空白隔開) : ");
		x1 = scanner.nextInt();
		x2 = scanner.nextInt();
		System.out.println("你輸入的第一個數字是 : " + x1);
		System.out.println("你輸入的第二個數字是 : " + x2);
		System.out.println("數字總和是           : " + (x1 + x2));
	}
}

