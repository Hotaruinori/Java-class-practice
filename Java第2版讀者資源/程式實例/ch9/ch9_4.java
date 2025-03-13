class SmallMath {
	int x, y;
	SmallMath(int a, int b) {				// 自建建構方法	
		x = a;
		y = b;
	}
	void add() {							// 執行和列印加法運算
		System.out.println("加法結果 : " + (x + y));
	}
	void mul() {							// 執行和列印乘法運算
		System.out.println("乘法結果 : " + (x * y));
	}
}

public class ch9_4 {
	public static void main(String[] args) {
		SmallMath A = new SmallMath(5, 10);	// 類別物件
		A.add();							// 列印加法結果
		A.mul();							// 列印乘法結果
	}
}
 

