class School {
	class Motto {								// Inner class
		public void printInfo() {
			System.out.println("勤勞樸實");
		}
	}
}
public class ch14_35 {
	public static void main(String[] args) {
		School sc = new School();				// 定義School物件
		School.Motto inner = sc.new Motto();	// 建立內部類別物件
		inner.printInfo();						// 直接呼叫內部類別的方法
	}
}

