public class ch7_23 {
	public static void main(String[] args) {
		int[][] x = new int[2][];		// 宣告二維陣列但是先配置第一維空間		
		for (int i = 0; i < x.length; i++)
			x[i] = new int[3];			// 配置第二維空間		
		System.out.println("x 元素數量 = " + x.length);
		for (int i = 0; i < x.length; i++)
			System.out.printf("x[%d]元素數量 = %d\n", i, x[i].length);
	}
}

