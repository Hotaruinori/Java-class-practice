public class ch7_12 {
	public static void main(String[] args) {
		int[] score = {90, 95, 80, 79, 92};		// 定義學生成績陣列
		int max, min;
		max = min = score[0];					// 暫定最大值與最小值
		for ( int sc:score ) {					// foreach迴圈
			if ( sc > max ) 					// 如果目前元素大於最大值
				max = sc;						// 將目前元素設為最大值
			if ( sc < min )						// 如果目前元素小於最小值
				min = sc;						// 將目前元素設為最小值
		}
		System.out.println("Max = " + max);		// 列印最大值
		System.out.println("Min = " + min);		// 列印最小值	
	}
}

