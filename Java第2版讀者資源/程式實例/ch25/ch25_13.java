@FunctionalInterface						// 這是選項optional
interface Message {							// 定義抽象類別
	Test getMsg(String msg);
}
class Test {
	Test(String msg) {
		System.out.println(msg);
	}
}
public class ch25_13 {
	public static void main(String[] args) {
		Message msgObj = Test::new;			// 方法參照
		msgObj.getMsg("Constructor");
	}
}

