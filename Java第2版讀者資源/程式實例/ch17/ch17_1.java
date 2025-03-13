interface Fly {							// 定義介面
	void flying();						// 抽象flying方法
}
class Bird implements Fly {				// 定義Bird類別實作Fly介面
	public void flying() {				// 實作flying方法
		System.out.println("鳥在飛行");	
	}
}
class Airplane implements Fly {			// 定義Airplane類別實作Fly介面
	public void flying() {				// 實作flying方法
		System.out.println("飛機在飛行");	
	}
}
public class ch17_1 {
	public static void main(String[] args) {
		Fly bird = new Bird();			// Upcasting
		bird.flying();
		Fly airplane = new Airplane();	// Upcasting
		airplane.flying();
	}
}

