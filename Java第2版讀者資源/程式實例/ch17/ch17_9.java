interface Animal {						// 定義Animal介面
	void showMe();						// 抽象showMe方法
}
interface Bird extends Animal {			// 定義Interface介面繼承Animal
	void flying(); 						// 抽象flying方法
}
class Eagle implements Bird {			// 定義Eagle類別實作Birds
	public void showMe() {				// 實作showMe方法
		System.out.println("我是動物");	
	}
	public void flying() {				// 實作flying方法
		System.out.println("我是老鷹我會飛");	
	}
}
public class ch17_9 {
	public static void main(String[] args) {
		Eagle eagle = new Eagle();		// 建立eagle物件
		eagle.showMe();
		eagle.flying();
	}
}

