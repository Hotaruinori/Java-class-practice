public class ch4_36 {
	public static void main(String[] args) {
		int x;
		double y;
		float z;
		long a;
		short x1 = 10;
		byte x2 = 5;
		
		y = (x = 10) + 3.3;				// 	將x轉成double
		System.out.println("y = " + y);
		z = x + 5.5F;					// 	將x轉成float
		System.out.println("z = " + z);
		a = x + 10L;					// 	將x轉成long
		System.out.println("a = " + a);
		x = x1 + x2;					// 	將x1和x2轉成int
		System.out.println("x = " + x);
	}
}

