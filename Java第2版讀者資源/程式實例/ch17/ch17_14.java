interface Dog {							// 定義Dog介面
	int age = 5;
	void running();						// 抽象running方法
}
interface Cat {							// 定義Cat介面
	int age = 6;
	void running(); 					// 抽象running方法
}
class Pet implements Dog, Cat {			// 類別Pet
	public void running() {				// 實作running方法
		System.out.println("我的寵物是 " + Dog.age + " 歲正在跑");	
	}
}
public class ch17_14 {
	public static void main(String[] args) {
		Pet obj = new Pet();			// 建立obj物件
		obj.running();
	}
}

