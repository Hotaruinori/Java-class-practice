public class ex7_4 {
	public static void main(String[] args) {
		double[][] degree = {
				{30, 28, 29, 31, 33, 35, 32},			// 最高溫度
				{20, 21, 19, 22, 23, 24, 20}			// 最低溫度
		};
		double sum, average;							// 總計溫度和平均溫度

		double max = 0;
		for (int i = 0; i < degree[0].length; i++) 
			if (degree[0][i] > max)
				max = degree[0][i];
		System.out.printf("最高溫 = %3.1f\n", max);
			
		double min = 99;
		for (int i = 0; i < degree[1].length; i++) 
			if (degree[1][i] < min)
				min = degree[1][i];
		System.out.printf("最低溫 = %3.1f\n", min);	
		
		System.out.printf("每天平均溫度 : ");	
		for (int i = 0; i < degree[0].length; i++) {
			sum = degree[0][i] + degree[1][i];			// 最初化總計溫度			
			average = sum / 2;							// 溫度平均
			System.out.printf("%5.2f  ", average);
		}
	}
}

