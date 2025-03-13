interface Shapes {							// 定義抽象類別
	public void draw();
}
public class ch25_3 {
	public static void main(String[] args) {
		int r = 5;							// 圓半徑
		Shapes obj = new Shapes() {			// 匿名類別
			public void draw() {			// 重新定義draw()
				System.out.println("繪半徑是 " + r + " 的圓");
			}
		};
		obj.draw();	
	}
}

