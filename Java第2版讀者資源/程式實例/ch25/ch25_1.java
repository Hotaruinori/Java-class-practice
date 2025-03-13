abstract class StringAdd<T> {								// 定義抽象類別
	abstract T display(T x, T y);
}
public class ch25_1 {
	public static void main(String[] args) {
		StringAdd<String> obj = new StringAdd<String>() { 	// 菱形符號有資料型態
			String display(String x, String y) {
				return x + y;
			}
		};
		System.out.println(obj.display("Java", "王者歸來"));	
	}
}

