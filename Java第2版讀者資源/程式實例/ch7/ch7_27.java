public class ch7_27 {
	public static void main(String[] args) {
		int[][] degree = {
				{25, 27, 29, 28, 26, 30, 28},			// 最高溫度
				{23, 25, 27, 26, 24, 28, 26},			// 平均溫度
				{21, 23, 25, 24, 22, 26, 24}			// 最低溫度
		};
		double sum, average;							// 總計溫度和平均溫度				
		String str = "";
		for (int i = 0; i < degree.length; i++) {
			sum = 0;									// 最初化總計溫度
			for (int de:degree[i])
				sum += de;								// 溫度總和
			average = sum / degree[i].length;			// 溫度平均
			switch (i) {
				case 0:
					str = "最高溫平均 : ";
					break;
				case 1:
					str = "平均溫平均 : ";
					break;
				case 2:
					str = "最低溫平均 : ";
					break;
			}
			System.out.printf("%s %5.2f\n", str, average);
		}
	}
}

