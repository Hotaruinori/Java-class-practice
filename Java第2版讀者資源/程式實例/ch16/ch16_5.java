abstract class Shape {							// 定義抽象類別Shape	
	public abstract void draw( );				// 定義抽象方法
}
class Circle extends Shape {					// 定義Circle圓形類別
	public void draw() {						// 繪製圓
		System.out.println("繪製圓");
	}
}
public class ch16_5 {
	public static void main(String[] args) {
		Circle circle = new Circle();			// 定義circle物件
		circle.draw();
	}
}

