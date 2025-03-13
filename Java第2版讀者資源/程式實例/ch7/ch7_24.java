public class ch7_24 {
	public static void main(String[] args) {
		int[][] x = new int[2][];		// 宣告二維陣列但是先配置第一維空間		
		x[0] = new int[3];				// 配置3個元素長度
		x[1] = new int[2];				// 配置2個元素長度
		System.out.println("x 元素數量 = " + x.length);
		for (int i = 0; i < x.length; i++)
			System.out.printf("x[%d]元素數量 = %d\n", i, x[i].length);
		x[0][0] = 1;					// 直接設定二維陣列元素值
		x[0][1] = 2;
		x[0][2] = 3;
		x[1][0] = 4;
		x[1][1] = 5;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++ ) 
			    System.out.printf("x[%d][%d] = %d\t", i, j, x[i][j]);
			System.out.println("");
		}
	}
}

