abstract class Car {
	abstract void run();						// 抽象方法
	Car () {									// 建構方法
		System.out.println("有車子了");
	}
	void refuel() {								// 實體普通方法
		System.out.println("汽車加油");
	}
}
class Bmw extends Car {							// 定義car子類別Bmw
	public void run() {							// 重新定義run方法
		System.out.println("安全駕駛中 ...");
	}
}
public class ch16_10 {
	public static void main(String[] args) {
		Bmw bmw = new Bmw();					// 定義Bmw類別物件bmw
		bmw.refuel();
		bmw.run();
	}
}

