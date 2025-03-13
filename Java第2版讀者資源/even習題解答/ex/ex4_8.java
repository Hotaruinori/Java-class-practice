import java.util.Scanner;
public class ex4_8 {
	public static void main(String[] args) {
		double PI;
		
		PI = 4 * (1 - 1.0/3.0 + 1.0/5 - 1.0/7 + 1.0/9);
		System.out.println("4 * (1 - 1/3 + 1/5 - 1/7 + 1/9) = " + PI);
		PI = 4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
		System.out.println("4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) = " + PI);
		PI = 4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);
		System.out.println("4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) = " + PI);
	}
}

