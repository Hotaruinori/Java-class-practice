class NBAPlayers {
	int age = 28;								// 年齡
	String name;								// 姓名
	NBAPlayers(String name) {					// 建構方法參數是一個字串
		this.name = name;						// 設定姓名
	}
	NBAPlayers(String name, int age) {			// 建構方法參數是一個整數和字串
		this(name);								// 設定姓名
		this.age = age;							// 設定年齡
	}
	void printInfo() {							// 列印成員變數
		System.out.println(name);				// 列印姓名
		System.out.println(age);				// 列印年齡
	}
}
public class ch9_11 {
	public static void main(String[] args) {
		NBAPlayers A = new NBAPlayers("LeBron James", 30);
		A.printInfo();
	}
}
 

