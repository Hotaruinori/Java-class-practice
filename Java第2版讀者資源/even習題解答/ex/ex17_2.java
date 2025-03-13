interface Shape {										// 定義介面Shape
	double PI = 3.14;									// 定義介面資料成員
	double vulumn( );									// 定義抽象方法
}
class Cube implements Shape {							// 定義Cube實作Shape
	protected double height, width, length;							
	Cube(double height, double width, double length) {	// 建構方法		
		this.height = height;
		this.width = width;
		this.length = length;
	}
	public double vulumn() {							
		return height * width * length;
	}
}
class Cylinder implements Shape {						// 定義Cylinder實作Shape
	protected double r, height;							// 定義半徑r			
	Cylinder(double r, double height) {					// 建構方法		
		this.r = r;
		this.height = height;
	}
	public double vulumn() {							
		return PI * r * r * height;						// PI是public可以直接用
	}
}
public class ex17_2 {
	public static void main(String[] args) {
		Cube cube = new Cube(2, 3, 10);					// 定義cube物件
		Cylinder cylinder = new Cylinder(2, 10);		// 定義cyliner物件
		System.out.println("立體方塊體積     : " + cube.vulumn());
		System.out.println("圓柱體積         : " + cylinder.vulumn());
	}
}

