public class ch7_19 {
	public static void main(String[] args) {
		int[][] x;
		x = new int[2][3];
		
		System.out.println("x 元素數量 = " + x.length);
		for (int i =0; i < x.length; i++)
			System.out.printf("x[%d]元素數量 = %d\n", i, x[i].length);
	}
}

