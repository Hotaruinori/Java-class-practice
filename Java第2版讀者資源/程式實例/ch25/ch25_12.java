@FunctionalInterface						// 這是選項optional
interface Message {							// 定義抽象類別
	void msg();
}
class Test {
	public void talking() {
		System.out.println("這不是static method");
	}
}
public class ch25_12 {
	public static void main(String[] args) {
		Test obj = new Test();
		Message msgObj = obj::talking;		// 方法參照
		msgObj.msg();
	}
}

