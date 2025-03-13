public class ch3_27 {
	public static void main(String[] args) {
		int x = 100;
		double y = 10.5;
		String s = "Deep";
		System.out.printf("x=/%6d/%n", x);
		System.out.printf("y=/%6.2f/%n", y);
		System.out.printf("s=/%6s/%n", s);
		System.out.println("以下是保留格數空間不足的實例");
		System.out.printf("x=/%2d/%n", x);
		System.out.printf("y=/%2.1f/%n", y);
		System.out.printf("s=/%2s/%n", s);
	}
}

