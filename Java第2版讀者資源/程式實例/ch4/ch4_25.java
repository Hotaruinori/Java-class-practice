public class ch4_25 {
	public static void main(String[] args) {
		byte x, y;
		int z;
		x = 0b01000101;
		y = (byte)0b10001010;						// byte type -118
		z = 0b11111111111111111111111110001010;		// int type -118
		System.out.println("x = " + x);
		System.out.println("x << 1 = " + (x << 1));
		System.out.println("y = " + y);
		System.out.println("y << 1 = " + (y << 1));
		System.out.println("z = " + z);
		System.out.println("z << 1 = " + (z << 1));
	}
}

