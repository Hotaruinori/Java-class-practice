public class ch7_17 {
	public static void main(String[] args) {
		int[] score = {90, 79, 92};				// 定義學生成績陣列
		int[] myscore = score;
		
		System.out.printf("score[1]   = %d\n", score[1]);
		System.out.printf("myscore[1] = %d\n", myscore[1]);
		System.out.printf("更改myscore[1]內容後\n");
		myscore[1] = 100;
		System.out.printf("score[1]   = %d\n", score[1]);
		System.out.printf("myscore[1] = %d\n", myscore[1]);
	}
}

