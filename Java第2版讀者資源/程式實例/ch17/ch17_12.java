interface Bird {						// 定義Bird介面
	void flying();						// 抽象flying方法
}
interface Airplane {					// 定義Airplane介面
	void flying(); 						// 抽象flying方法
}
class InfoFly implements Bird, Airplane {
	public void flying() {				// 實作flying方法
		System.out.println("正在飛行");	
	}
}
public class ch17_12 {
	public static void main(String[] args) {
		InfoFly obj = new InfoFly();	// 建立obj物件
		obj.flying();
	}
}

