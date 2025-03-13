public class ch4_28 {
	public static void main(String[] args) {
		int x, y;
		x = 0b00000000000000000000000000000101;
		y = 0b11111111111111111111111111111000;
		System.out.println("x = " + x);
		System.out.println("x >>> 1 = " + (x >>> 1));
		System.out.println("x >>> 2 = " + (x >>> 2));
		System.out.println("y = " + y);
		System.out.println("y >>> 1 = " + (y >>> 1));
		System.out.println("y >>> 2 = " + (y >>> 2));
		System.out.println("y >>> 3 = " + (y >>> 3));
	}
}

