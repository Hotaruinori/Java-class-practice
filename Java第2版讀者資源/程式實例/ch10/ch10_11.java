public class ch10_11 {
	public static void main(String[] args) {
		double rate = 0.06;				// 利率
		double capital = 100000;		// 本金
		double capitalInfo;
		for ( int i = 1; i <= 20; i++ ) {
			capitalInfo = capital * Math.pow((1.0 + rate), i);
			System.out.printf("第 %2d 年後本金和是 %10.2f\n", i, capitalInfo);
		}
	}
}

