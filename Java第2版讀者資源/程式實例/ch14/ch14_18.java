class Car {
	private int maxSpeed;
	private String color;	
	public void setMaxSpeed(int maxSpeed) {			// 設定最高速度方法
		this.maxSpeed = maxSpeed;
	}
	public void setColor(String color) {			// 設定車子顏色方法
		this.color = color;
	}
	public void printCarInfo() {
		System.out.println("車子最高時速 : " + maxSpeed +"\n車子外觀顏色 : " + color);
	}
}
class Sentra extends Car {							// 繼承Car類別
	public void SentraShow() {						// Sentra類別自有方法
		Engine sentraEngine = new Engine();			// Composition
		sentraEngine.starting();					// 引擎啟動
		sentraEngine.running();						// 引擎運轉
		sentraEngine.stopping();					// 引擎停止
	}
}
class Engine {										// 是Sentra類別的屬性
	public void starting() {						// Engine類別自有方法
		System.out.println("引擎啟動");
	}
	public void running() {							// Engine類別自有方法
		System.out.println("引擎運轉");
	}
	public void stopping() {						// Eigine類別自有方法
		System.out.println("引擎停止");
	}
}
public class ch14_18 {
	public static void main(String[] args) {
		Sentra sentra = new Sentra();		
		sentra.setMaxSpeed(220);					// 使用繼承Car方法
		sentra.setColor("藍色");					// 使用繼承Car方法
		sentra.printCarInfo();						// 繼承Car方法列印資訊
		sentra.SentraShow();						// 展示引擎運作
	}
}

