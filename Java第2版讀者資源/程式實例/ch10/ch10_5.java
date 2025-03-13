public class ch10_5 {
	public static void main(String[] args) {
		int x1 = 30;							// 定義3個整數int
		int x2 = 50;
		int x3 = 80;
		int maxV;
		maxV = Math.max(Math.max(x1, x2), x3);	// 求3個值的較大值
		System.out.println("3個數值的較大值是 : " + maxV);
		double y1 = 5.5;						// 定義2個雙倍精度浮點數double
		double y2 = 3.6;
		double minV;		
		minV = Math.min(y1, y2);				// 求2個值的較小值
		System.out.println("2個數值的較小值是 : " + minV);
	}
}

