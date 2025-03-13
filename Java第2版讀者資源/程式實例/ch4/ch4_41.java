public class ch4_41 {
	public static void main(String[] args) {
		int x;
		byte y;
		x = 0b10000000;
		System.out.println("x = " + x);
		y = (byte) x;	// 強制轉為byte
		System.out.println("y = " + y);
	}
}

