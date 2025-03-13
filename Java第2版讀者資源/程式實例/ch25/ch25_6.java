@FunctionalInterface						// 這是選項optional
interface Hi {								// 定義抽象類別
	public String talking(String name);
}
public class ch25_6 {
	public static void main(String[] args) {
		Hi obj = name->{					// Lambda表達式省略小括號
				return "Hi! " + name;
		};
		System.out.println(obj.talking("Peter"));
	}
}

