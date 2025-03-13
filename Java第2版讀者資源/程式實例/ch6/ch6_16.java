import java.util.Scanner;
public class ch6_16 {
	public static void main(String[] args) {
		int loop = 1000000;
		int i;
		double pi = 0.0;
		for (i = 1; i <= loop; i++) {
			pi += 4 * (Math.pow(-1, i+1) / (2*i - 1));
			if (i % 100000 == 0)
				System.out.printf("i = %7d 時 PI =%15.14f%n", i, pi);
		}		
	}
} 

