package Week04;


public class Abstract1 {
	public static void main(String[] args) {
		Shape shape = new Triangle(10, 6);
		int area = shape.computeArea();
		System.out.println("Triangle:" + area);

		shape = new Rectangle(10, 6);
		area = shape.computeArea();
		System.out.println("Rectangle:" + area);
	}
}

abstract class Shape {
	// 計算面積
	public abstract int computeArea();
}

class Triangle extends Shape {
	int width;
	int height;

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int computeArea() {
		return (width * height) / 2;
	}
}

class Rectangle extends Shape {
	int width;
	int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int computeArea() {
		return width * height;
	}
}
