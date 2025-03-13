import java.util.Scanner;
public class ex5_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("請輸入身高(公分) : ");
		double height = scanner.nextDouble();
		System.out.printf("請輸入體重(公斤) : ");
		double weight = scanner.nextDouble();
		double bmi;
		bmi = weight / ((height / 100) * (height / 100));
		
		if (bmi < 18.5)
			System.out.printf("BMI = %4.2f 體重過輕%n", bmi);
		else if (bmi >= 18.5 && bmi < 24)
			System.out.printf("BMI = %4.2f 體重正常%n", bmi);
		else if (bmi >= 24 && bmi < 28)
			System.out.printf("BMI = %4.2f 體重超重%n", bmi);
		else 
			System.out.printf("BMI = %4.2f 體重肥胖%n", bmi);
	}
}

