public class ch4_21 {
	public static void main(String[] args) {
		int x, y, larger, smaller;
		x = 100;
		y = 50;
		larger = x > y? x:y;
		System.out.println("較大值 : " + larger);
		smaller = x < y? x:y;
		System.out.println("較小值 : " + smaller);
	}
}

