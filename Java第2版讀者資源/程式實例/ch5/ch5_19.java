import java.util.Scanner;
public class ch5_19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("請輸入火箭速度 : ");
		double v = scanner.nextDouble();
		
		if (v < 7.9)
			System.out.println("人造衛星無法進入太空");
		else if (v == 7.9)
			System.out.println("人造衛星可以環繞地球作圓形運動");
		else if (v > 7.9 && v < 11.2)
			System.out.println("人造衛星可以環繞地球作橢圓形運動");
		else if (v >= 11.2 && v < 16.7)
			System.out.println("人造衛星可以環繞太陽移動");
		else
			System.out.println("人造衛星可以脫離太陽系");		
	}
}

