public class ex18_4 {
	public static void main(String[] args) {
		Integer a = Integer.valueOf("101f", 16);
		Integer b = Integer.valueOf("1111aaff", 16);
		Integer c = Integer.valueOf("10010f", 16);		
		
		System.out.println("101f     = " + a);
		System.out.println("1111aaff = " + b);
		System.out.println("10010f   = " + c);
	}
}

