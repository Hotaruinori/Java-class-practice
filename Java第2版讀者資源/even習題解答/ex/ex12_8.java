import java.util.Scanner;
public class ex12_8 {
	public static void main(String[] args) {
		String x;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入英文句子 : ");
		x = scanner.nextLine();
		System.out.println("大寫輸入結果 : " + x.toUpperCase());
	}
}

