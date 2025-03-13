interface Bird {						// 定義Bird介面
	void birdFly();						// 抽象birdFly方法
}
interface Airplane {					// 定義Airplane介面
	void airplaneFly(); 				// 抽象airplaneFly方法
}
interface Fly extends Bird, Airplane {	// 定義Fly介面繼承Bird和Airplane
	void pediaFly( );					// 抽象pediaFly方法
}
class InfoFly implements Fly {
	public void birdFly() {				// 實作birdFly方法
		System.out.println("鳥用翅膀飛");	
	}
	public void airplaneFly() {			// 實作airplaneFly方法
		System.out.println("飛機用引擎飛");	
	}
	public void pediaFly() {			// 實作pediaFly方法
		System.out.println("飛行百科");
	}
}
public class ch17_11 {
	public static void main(String[] args) {
		InfoFly obj = new InfoFly();	// 建立obj物件
		obj.birdFly();
		obj.airplaneFly();
		obj.pediaFly();
	}
}

