public class ch4_32 {
	public static void main(String[] args) {
		int x;
		x = 5 * 4 + 8 % 3 << 3;
		System.out.println("x = " + x);	 
		x = ((5 * 4) + ( 8 % 3)) << 3;	// 建議寫法
		System.out.println("x = " + x);
	}
}

