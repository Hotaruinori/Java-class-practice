import java.util.*;
abstract class Shapes {								// 抽象類別Shapes
	abstract void demo();							// 抽象方法demo 
}
class Square extends Shapes {						// Square繼承Shapes
	void demo() {
		System.out.println("我是正方形");
	}
}
class Circle extends Shapes {						// Circle繼承Shapes
	void demo() {
		System.out.println("我是圓形");
	}
}
public class ch24_03 {	
// <? extends Shapes>表示所有衍生自Shapes的類別皆可以執行
	public static void demoShapes(ArrayList<? extends Shapes> lists) {
		for(Shapes list:lists)
			list.demo();							// 執行demo
	}
	public static void main(String[] args) {
		ArrayList<Square> alist1 = new ArrayList<Square>();
		alist1.add(new Square());					// alist1物件元素是Square類別物件
		ArrayList<Circle> alist2 = new ArrayList<Circle>();
		alist2.add(new Circle());					// alist2物件元素是Circle類別物件
		demoShapes(alist1);
		demoShapes(alist2);
	}
}

