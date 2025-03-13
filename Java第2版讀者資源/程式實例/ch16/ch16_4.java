abstract class Shape {							// 定義抽象類別Shape	
	public void draw( ) {						// 純定義
	}
}
class Circle extends Shape {					// 定義Circle圓形類別
	public void draw() {						// 繪製圓
		System.out.println("繪製圓");
	}
}
public class ch16_4 {
	public static void main(String[] args) {
		Circle circle = new Circle();			// 定義circle物件
		circle.draw();
	}
}

