abstract class Car {
	abstract void run();						// 抽象方法		
	void refuel() {								// 實體普通方法
		System.out.println("汽車加油");
	}
}
class Bmw extends Car {							// 定義car子類別Bmw
}
public class ch16_8 {
	public static void main(String[] args) {
		Bmw bmw = new Bmw();					// 定義Bmw類別物件bmw
		bmw.refuel();
	}
}

