public class ch7_21 {
	public static void main(String[] args) {
		int[][] x = { {1, 2, 3}, {4, 5, 6} };  	// 定義二維陣列同時設定初值
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++ ) 
			    System.out.printf("x[%d][%d] = %d\t", i, j, x[i][j]);
			System.out.println("");
		}
	}
}

