public class ch8_23 {
	public static void main(String[] args) {
		System.out.println("3的階乘結果是 = " + factorial(3));
		System.out.println("5的階乘結果是 = " + factorial(5));
	}
	public static int factorial(int n) {
		if ( n == 1 )
			return 1;
		else
			return (n * factorial(n-1));
	}
}

