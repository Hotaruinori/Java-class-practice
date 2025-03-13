interface Shape {										// 定義介面Shape
	double PI = 3.14;									// 定義介面資料成員
	double area( );										// 定義抽象方法
}
class Rectangle implements Shape {						// 定義Rectangle實作Shape
	protected double height, width;						// 定義寬width和高height			
	Rectangle(double height, double width) {			// 建構方法		
		this.height = height;
		this.width = width;
	}
	public double area() {								// 計算矩形面積
		return height * width;
	}
}
class Circle implements Shape {							// 定義Circle實作Shape
	protected double r;									// 定義半徑r			
	Circle(double r) {									// 建構方法		
		this.r = r;
	}
	public double area() {								// 計算圓面積
		return PI * r * r;								// PI是public可以直接用
	}
}
public class ch17_2 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(2, 3);		// 定義rectangle物件
		Circle circle = new Circle(2);					// 定義circle物件
		System.out.println("矩形面積     : " + rectangle.area());
		System.out.println("圓面積       : " + circle.area());
		System.out.println("Shape.PI     : " + Shape.PI);	   // 可直接由Shape存取
		System.out.println("circle.PI    : " + circle.PI);	   // 可由circle物件存取
		System.out.println("rectangle.PI : " + rectangle.PI);  // 可由rectangle物件存取
	}
}

