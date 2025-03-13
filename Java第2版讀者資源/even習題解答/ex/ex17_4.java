interface Bird {						// 定義Bird介面
	void birdFly();						// 抽象birdFly方法
}
interface Airplane {					// 定義Airplane介面
	void airplaneFly(); 				// 抽象airplaneFly方法
}
interface FlyingBall {					// 定義FlyingBall介面
	void ballFly(); 					// 抽象ballFly方法
}
class Fly implements Bird, Airplane, FlyingBall {	// 定義Fly類別實作Bird,Airplane,FayingBall
	public void birdFly() {				// 實作birdFly方法
		System.out.println("鳥用翅膀飛");	
	}
	public void airplaneFly() {			// 實作airplaneFly方法
		System.out.println("飛機用引擎飛");	
	}
	public void ballFly() {				// 實作ballFly方法
		System.out.println("飛行球用球飛");	
	}
}
public class ex17_4 {
	public static void main(String[] args) {
		Fly obj = new Fly();			// 建立obj物件
		obj.birdFly();
		obj.airplaneFly();
		obj.ballFly();
	}
}

