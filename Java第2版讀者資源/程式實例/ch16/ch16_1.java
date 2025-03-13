class Shape {
	public void draw( ) {						// 純定義
	}
}
class Rectangle extends Shape {					// 定義Rectangle矩形類別
	public void draw() {						// 繪製矩形
		System.out.println("繪製矩形");
	}
}
class Circle extends Shape {					// 定義Circle圓形類別
	public void draw() {						// 繪製圓
		System.out.println("繪製圓");
	}
}
public class ch16_1 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();	// 定義rectangle物件
		Circle circle = new Circle();			// 定義circle物件
		rectangle.draw();
		circle.draw();
	}
}

