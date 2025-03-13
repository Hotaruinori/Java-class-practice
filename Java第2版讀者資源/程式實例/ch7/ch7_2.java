public class ch7_2 {
	public static void main(String[] args) {
		double average;				// 存放平均溫度	
		double total = 0;			// 存放溫度總和
		double[] degree;
		degree = new double[7];		// 每天溫度
		
		degree[0] = 25;
		degree[1] = 22;
		degree[2] = 24;
		degree[3] = 20;
		degree[4] = 26;
		degree[5] = 21;
		degree[6] = 21;
		for ( int i = 0; i < 7; i++ )
			total += degree[i];		// 計算溫度總和
		average =  total / 7;	 	// 計算平均溫度
		System.out.printf("一週平均溫度 : %5.2f", average);			
	}
}

