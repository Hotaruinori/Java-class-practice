public class ch20_3 {
	public static void main(String[] args) {
	int[] x = {5, 6, 7, 8, 9};
	int sum = 0;
		for ( int i = 0; i <= x.length; i++ ) { 	// 加法迴圈		
			sum += x[i];							// 加法總計
			System.out.printf("索引值 : %d,  加總結果 : %d\n", i, sum);	
		}
	}
}

