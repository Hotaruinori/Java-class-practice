class MyMath {								// 處理圓半徑的平方值
	protected int square(int x) {
		return x*x;
	}
}
class Circle {
	protected MyMath obj;					// Aggregation
	public double getArea(int radius) {
		obj = new MyMath();					// 建立MyMath物件
		int rSquare = obj.square(radius);	// 程式碼可重複使用
		return Math.PI*rSquare;				// 回傳圓面積
	}
}
public class ch14_16 {
	public static void main(String[] args) {
		Circle circle = new Circle();		// 建立Circle物件
		double area = circle.getArea(10);	// 計算圓面積
		System.out.printf("圓面積是 : %6.2f\n", area);
	}
}

