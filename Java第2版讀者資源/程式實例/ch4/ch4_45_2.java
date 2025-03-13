import java.util.Scanner;
public class ch4_45_2 {
	public static void main(String[] args) {
		char ch;
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("請輸入字元 : ");
		ch = scanner.next().charAt(0);
		System.out.println("你輸入的字元是 = " + ch);
	}
}

