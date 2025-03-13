interface Animal {								// 定義Animal介面
	void who();									// 定義抽象方法who
	default void running() {					// Default running方法
		System.out.println("動物在跑");	
	}
}
interface Dog extends Animal {					// 定義Dog介面
	default void running() {					// Default running方法
		System.out.println("狗在跑");
	}
}
class Pet implements Dog {						// 定義Pet類別
	public void who() {							// 實作who方法
		System.out.println("我是動物");
	}
}
public class ch17_19 {
	public static void main(String[] args) {
		Pet obj = new Pet();					// 建立obj物件
		obj.running();							// 子介面優先
		obj.who();								// 呼叫who
	}
}

