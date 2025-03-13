public class ch4_42 {
	public static void main(String[] args) {
		int x1, x2;
		x1 = 17;
		x2 = -2;
		System.out.println("x1的2進位是  : " + Integer.toBinaryString(x1));
		System.out.println("x2的2進位是  : " + Integer.toBinaryString(x2));
		System.out.println("x1的8進位是  : " + Integer.toOctalString(x1));
		System.out.println("x2的8進位是  : " + Integer.toOctalString(x2));
		System.out.println("x1的16進位是 : " + Integer.toHexString(x1));
		System.out.println("x2的16進位是 : " + Integer.toHexString(x2));
	}
}

