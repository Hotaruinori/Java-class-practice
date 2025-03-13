@FunctionalInterface						// 這是選項optional
interface Message {							// 定義抽象類別
	void msg();
}
class Test {
	public static void talking() {
		System.out.println("這是static method");
	}
}
public class ch25_10 {
	public static void main(String[] args) {
		Message obj = (Test::talking);		// 方法參照
		obj.msg();
	}
}

