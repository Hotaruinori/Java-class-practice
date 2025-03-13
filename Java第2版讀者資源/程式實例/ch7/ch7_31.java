public class ch7_31 {
	public static void main(String[] args) {
		double[] data = {5, 6, 8, 9};			
		double sum = 0;									
		for ( int i = 0; i < data.length; i++ )
			sum += data[i];
		double average = sum / data.length; 				// 計算平均值
		System.out.printf("平均值 = %4.2f%n", average);
		
		double var = 0;
		for (int i = 0; i < data.length; i++)
			var += Math.pow((data[i] - average), 2);
		var = var / data.length; 							// 計算變異數
		System.out.printf("變異數 = %4.2f%n", var);
				
		double dev = 0;
		for (int i = 0; i < data.length; i++)
			dev += Math.pow((data[i] - average), 2);
		dev = Math.pow((dev / data.length), 0.5); 			// 計算標準差
		System.out.printf("標準差 = %4.2f%n", dev);
	}
}

