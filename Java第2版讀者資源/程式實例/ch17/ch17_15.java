interface Dog {							// 定義Dog介面
	default void running() {			// Default running方法
		System.out.println("狗在跑");	
	}
}
interface Cat {							// 定義Cat介面
	default void running() {			// Default running方法
		System.out.println("貓在跑");
	}
}
class Pet implements Dog, Cat {			// 定義Pet類別
	public void running() {				// 重新定義running方法
		System.out.println("動物在跑");
	}
}
public class ch17_15 {
	public static void main(String[] args) {
		Pet obj = new Pet();			// 建立obj物件
		obj.running();	
	}
}

