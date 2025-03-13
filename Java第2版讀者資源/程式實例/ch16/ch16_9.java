abstract class Car {
	abstract void run();						// 抽象方法		
	void refuel() {								// 實體普通方法
		System.out.println("汽車加油");
	}
}
abstract class Bmw extends Car {				// Bmw子類別定義為抽象類別
}
class Type750 extends Bmw {						// 繼承Bmw類別
	public void run() {							// 重新定義run方法
		System.out.println("安全駕駛中 ...");
	}
}
public class ch16_9 {
	public static void main(String[] args) {
		Type750 bmw = new Type750();			// 定義Type750類別物件bmw
		bmw.refuel();
		bmw.run();
	}
}

