interface Bird {						// 定義Bird介面
	void showMe();						// 抽象showMe方法
	default void action() {				// Default方法
		System.out.println("我會飛");
	}
	
}
class Eagle implements Bird {			// 定義Eagle類別實作Bird
	public void showMe() {				// 重新定義showMe方法
		System.out.println("我是鳥");	
	}
}
public class ch17_3 {
	public static void main(String[] args) {
		Eagle eagle = new Eagle();		// 建立eagle物件
		eagle.showMe();
		eagle.action();
	}
}

