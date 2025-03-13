interface Dog {								// 定義Dog介面
	void running();							// 抽象running方法
}
class Horse {								// 定義Horse類別
	public void who() {						// 一般方法who
		System.out.println("我是馬");
	}
}
class Pet extends Horse implements Dog {	// Pet繼承Horse實作Dog
	public void running() {					// 實作running方法
		System.out.println("寵物在跑");
	}
}
public class ch17_17 {
	public static void main(String[] args) {
		Pet obj = new Pet();				// 建立obj物件
		obj.who();
		obj.running();	
	}
}

