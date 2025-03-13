interface Dog {									// 定義Dog介面
	void who();									// 定義抽象方法who
	default void running() {					// Default running方法
		System.out.println("狗在跑");	
	}
}
interface Cat {									// 定義Cat介面
	void who();									// 定義抽象方法who
	default void running() {					// Default running方法
		System.out.println("貓在跑");
	}
}
class Horse {
	public void running() {
		System.out.println("馬在跑");
	}
}
class Pet extends Horse implements Dog, Cat {	// 定義Pet類別
	public void who() {							// 實作who方法
		System.out.println("我是寵物");
		Dog.super.running();					// Dog介面的running
		Cat.super.running();					// Cat介面的running
	}
}
public class ch17_18 {
	public static void main(String[] args) {
		Pet obj = new Pet();					// 建立obj物件
		obj.running();							// 類別優先
		obj.who();								// 呼叫who
	}
}

