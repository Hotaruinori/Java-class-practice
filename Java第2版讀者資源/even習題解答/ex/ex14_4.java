class MyMath {										// 處理圓半徑的平方值
	protected int square(int x) {
		return x*x;
	}
}
class Cylinder {
	protected MyMath obj;							// Aggregation
	public double getVolume(int radius, int height) {
		obj = new MyMath();							// 建立MyMath物件
		int rSquare = obj.square(radius);			// 程式碼可重複使用
		return Math.PI*rSquare*height;				// 回傳圓柱體積
	}
}
public class ex14_4 {
	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder();			// 建立Cylinder物件
		double volume = cylinder.getVolume(10, 5);	// 計算圓柱體積
		System.out.printf("圓柱體積是 : %6.2f\n", volume);
	}
}

