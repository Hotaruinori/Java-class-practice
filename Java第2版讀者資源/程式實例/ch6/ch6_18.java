import java.util.Scanner;
public class ch6_18 {
	public static void main(String[] args) {
		int sum = 0;
		double wheat = 1;
		int i;
		for (i = 0; i < 20; i++) {
			if (i == 0)
				wheat = 1;
			else
				wheat = Math.pow(2, i);
			sum += wheat;
		}
		System.out.println("麥粒總共 = " + sum);	
	}
} 


