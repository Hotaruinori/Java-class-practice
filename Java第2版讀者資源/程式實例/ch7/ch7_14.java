public class ch7_14 {
	public static void main(String[] args) {
		int[] score = {90, 58, 80, 49, 92};			// 定義學生成績陣列
		int tmp;									// 暫時儲存分數
		for ( int i = 0; i < (score.length - 1); i++ )  {
			for ( int j = 0; j < (score.length - 1); j++ ) {
				if ( score[j] < score[j+1] ) {		// 發生前面元素比後面元素小
					tmp = score[j];
					score[j] = score[j+1];			// 較大的元素值放前面
					score[j+1] = tmp;				// 較小的元素值放後面
				}
			}
			System.out.printf("列出第 %d 次迴圈排序結果\n", (i+1));
			for ( int sc:score )
				System.out.printf("%d ", sc);		// 列印目前排序狀況
			System.out.println("");	
		}
	}
}

