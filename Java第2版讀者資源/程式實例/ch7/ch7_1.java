public class ch7_1 {
	public static void main(String[] args) {
		double deg1 = 25, deg2 = 22, deg3 = 24, deg4 = 20;
		double deg5 = 26, deg6 = 21, deg7 = 21;
		double average;
		
		average = (deg1 + deg2 + deg3 + deg4 + deg5 + deg6 + deg7) / 7;	 // 計算平均溫度
		System.out.printf("一週平均溫度 : %5.2f", average);			
	}
}

