class Shape {
	public double area( ) {								// 純定義
		return 0;
	}
}
class Rectangle extends Shape {							// 定義Rectangle矩形類別
	protected double height, width;						// 定義寬width和高height			
	Rectangle(double height, double width) {			// 建構方法		
		this.height = height;
		this.width = width;
	}
	public double area() {								// 計算矩形面積
		return height * width;
	}
}
class Circle extends Shape {							// 定義Circle圓形類別
	protected double r;									// 定義半徑r			
	Circle(double r) {									// 建構方法		
		this.r = r;
	}
	public double area() {								// 計算圓面積
		return Math.PI * r * r;
	}
}
public class ch16_2 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(2, 3);		// 定義rectangle物件
		Circle circle = new Circle(2);					// 定義circle物件
		System.out.println("矩形面積 : " + rectangle.area());
		System.out.println("圓面積   : " + circle.area());	
	}
}

