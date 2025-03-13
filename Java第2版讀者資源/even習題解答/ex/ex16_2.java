abstract class Shape {									// 定義抽象類別
	public abstract double area( );						// 定義抽象方法
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
class Cylinder extends Shape {							// 定義Cylinder類別
	protected double r, height;							// 定義半徑r, 高度height			
	Cylinder(double r, double height) {					// 建構方法		
		this.r = r;
		this.height = height;
	}
	public double area() {								// 計算圓柱體積
		return Math.PI * r * r * height;
	}
}
public class ex16_2 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(2, 3);		// 定義rectangle物件
		Circle circle = new Circle(2);					// 定義circle物件
		Cylinder cylinder = new Cylinder(2, 5);
		System.out.println("矩形面積 : " + rectangle.area());
		System.out.println("圓面積   : " + circle.area());	
		System.out.println("圓柱體積 : " + cylinder.area());
	}
}

