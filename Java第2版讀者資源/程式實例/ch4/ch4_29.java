public class ch4_29 {
	public static void main(String[] args) {
		int x, y;
		x = 0b00000000000000000000000000000101;
		y = 0b11111111111111111111111111111000;
		x &= y;
		System.out.println("x = " + x);
		x = 0b00000000000000000000000000000101;
		x |= y;
		System.out.println("x = " + x);
		x = 0b00000000000000000000000000000101;
		x ^= y;
		System.out.println("x = " + x);
		y = 1;
		x = 0b00000000000000000000000000000101;
		x <<= y;
		System.out.println("x = " + x);
		x = 0b00000000000000000000000000000101;
		x >>= y;
		System.out.println("x = " + x);
		x = 0b00000000000000000000000000000101;
		x >>>= y;
		System.out.println("x = " + x);
	}
}


