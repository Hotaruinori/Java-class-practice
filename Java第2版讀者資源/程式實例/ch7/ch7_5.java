public class ch7_5 {
	public static void main(String[] args) {
		double average;				// 存放平均溫度	
		double total = 0;			// 存放溫度總和
		double[] degree = {25, 22, 24, 20, 26, 21, 21};
		
		for ( int i = 0; i < degree.length; i++ )
			total += degree[i];					// 計算溫度總和
		average =  total / degree.length;	 	// 計算平均溫度
		System.out.printf("一週平均溫度 : %5.2f", average);			
	}
}

