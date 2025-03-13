@FunctionalInterface						// 這是選項optional
interface Shapes {							// 定義抽象類別
	public void draw();
}
public class ch25_4 {
	public static void main(String[] args) {
		int r = 5;							// 圓半徑
		Shapes obj = ()->{					// Lambda表達式
				System.out.println("繪半徑是 " + r + " 的圓");
		};
		obj.draw();
	}
}

