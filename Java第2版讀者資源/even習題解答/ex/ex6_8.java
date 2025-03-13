import java.util.Scanner;
public class ex6_8 {
	public static void main(String[] args) {	
        Scanner scanner = new Scanner(System.in);
		System.out.printf("請輸入高度 : ");
		int height = scanner.nextInt();	
		System.out.printf("請輸入寬度 : ");
		int width = scanner.nextInt();
				
		for ( int i = 1; i <= height; i++ ) {			
			for ( int j = 1; j <= width; j++ ) 
				System.out.print("*");	
			System.out.println();
		}				
	}
} 

