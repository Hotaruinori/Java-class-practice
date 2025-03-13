public class ch7_11 {
	public static void main(String[] args) {
		double[] score = {90, 95, 80, 79, 92};	// 定義學生成績陣列
		double total = 0;
		for ( double sc:score )					// foreach迴圈
			total += sc;						// 先計算總分
		double average = total / score.length;	// 計算平均
		System.out.printf("average = %5.2f", average);			
	}
}

