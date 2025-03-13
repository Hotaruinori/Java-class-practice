import java.util.Scanner;
public class ch5_17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("請輸入身高(公分) : ");
		double height = scanner.nextDouble();
		System.out.printf("請輸入體重(公斤) : ");
		double weight = scanner.nextDouble();
		double bmi;
		bmi = weight / ((height / 100) * (height / 100));
		System.out.println("BMI = " + bmi);
		if (bmi >= 18.5 && bmi < 24)
			System.out.println("體重正常");
		else
			System.out.println("體重不正常");				
	}
}

