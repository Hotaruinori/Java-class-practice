public class ch4_41_1 {
	public static void main(String[] args) {
		int x = 7;
		int y = 2;
		double z;
		
		z = x / y;
		System.out.println("x = " + z);
		z = (double) x / y;
		System.out.println("z = " + z);
		System.out.println("z = " + (int)z);
	}
}

