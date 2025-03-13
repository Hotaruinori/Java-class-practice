interface A {								// 定義A介面
	default void running() {				// Default running方法
		System.out.println("我是A");	
	}
}
interface B extends A {						// 定義B介面
	default void running() {				// Default running方法
		System.out.println("我是B");
	}
}
interface C extends A {						// 定義C介面
	default void running() {				// Default running方法
		System.out.println("我是C");
	}
}
class D implements B, C {					// 定義D類別
	public void running() {					// 重新定義running方法
		System.out.println("我是D");
	}
	public void who() {
		B.super.running();
		C.super.running();
	}
}
public class ch17_20 {
	public static void main(String[] args) {
		D obj = new D();					// 建立obj物件
		obj.running();						// 類別優先
		obj.who();							// 呼叫who
	}
}

