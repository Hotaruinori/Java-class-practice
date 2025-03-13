public class ch7_13 {
	public static void main(String[] args) {
		int[] score = {90, 58, 80, 49, 92};					// 定義學生成績陣列
		int passingScore = 60;								// 最低標準分數
		for ( int i = 0; i < score.length; i++ ) {					
			if ( score[i] < passingScore )					// 如果低於最低標準分數
				System.out.printf("score[%d] = %d\n", i, score[i]);		// 列印分數
		}
	}
}

