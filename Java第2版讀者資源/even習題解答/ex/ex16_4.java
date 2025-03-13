abstract class MyMath {									// 抽象類別
	abstract int add(int num1, int num2);				// 抽象add方法
	abstract int add(int num1, int num2, int num3);		// 抽象add方法
	abstract int mul(int num1, int num2);				// 乘法
	abstract int mul(int num1, int num2, int num3);		// 乘法
	void output() {										// 實體普通方法
		System.out.println("我的計算器");
	}
}
class MyTest extends MyMath {							// 定義MyMath子類別MyTest
	public int add(int num1, int num2) {				// 重新定義add方法
		return num1 + num2;
	}
	public int add(int num1, int num2, int num3) {		// 重新定義add方法
		return num1 + num2 + num3;
	}
	public int mul(int num1, int num2) {				// 重新定義mul方法
		return num1 * num2;
	}
	public int mul(int num1, int num2, int num3) {		// 重新定義mul方法
		return num1 * num2 * num3;
	}
}
public class ex16_4 {
	public static void main(String[] args) {
		MyMath obj = new MyTest();				// Upcasting
		obj.output();
		System.out.println("加法結果 : " + obj.add(3, 8));
		System.out.println("加法結果 : " + obj.add(3, 8, 10));
		System.out.println("乘法結果 : " + obj.mul(3, 8));
		System.out.println("乘法結果 : " + obj.mul(3, 8, 10));
	}
}

