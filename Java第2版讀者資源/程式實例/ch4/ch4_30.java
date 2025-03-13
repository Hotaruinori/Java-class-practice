public class ch4_30 {
	public static void main(String[] args) {
		int x;
		x = 9 * 4 << 3 + 2;		
		System.out.println("x = " + x);
		x = (9 * 4) << (3 + 2);			// 建議寫法
		System.out.println("x = " + x);		
	}
}

