import java.util.Scanner;
public class ex6_2 {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println(sum);
	}
}

