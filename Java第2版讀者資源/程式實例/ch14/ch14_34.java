class School {
	private class Motto {				// Inner class
		public void printInfo() {
			System.out.println("勤勞樸實");
		}
	}
	void display() {					// 讀取Inner class
		Motto meobj = new Motto();		// 建立內部類別motto物件
		meobj.printInfo();
	}
}
public class ch14_34 {
	public static void main(String[] args) {
		School sc = new School();		// 定義School物件
		sc.display();					// 呼叫display()方法
	}
}

