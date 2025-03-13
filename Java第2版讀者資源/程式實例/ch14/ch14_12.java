class MyMath {
	protected int result;				// 宣告protected存取修飾符定義計算結果
	public void add(int x, int y) {		// MyMath類別方法add
		this.result = x + y;
		System.out.println("加法結果 : " + this.result);
	}
	public void sub(int x, int y) {		// MyMath類別方法sub
		this.result = x - y;
		System.out.println("減法結果 : " + this.result);
	}
}
public class ch14_12 extends MyMath {
	public void mul(int x, int y) {		// ch14_12類別方法mul
		result = x * y;
		System.out.println("乘法結果 : " + result);
	}
	public static void main(String[] args) {
		ch14_12 obj = new ch14_12();	// 定義ch14_12類別物件
		int a1 = 50, a2 = 5;
		obj.add(a1, a2);				// 呼叫繼承方法add()
		obj.sub(a1, a2);				// 呼叫繼承方法sub()
		obj.mul(a1, a2);				// 呼叫自己類別方法mul()
	}
}

