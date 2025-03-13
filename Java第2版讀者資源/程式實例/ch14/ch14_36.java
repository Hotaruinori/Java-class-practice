class School {
	int students = 400;							// 學生人數
	class Mis {									// 定義資管系類別
		public int getNum() {
			return students;					// 傳回學生人數
		}
	}
}
public class ch14_36 {
	public static void main(String[] args) {
		School sc = new School();				// 定義School物件
		School.Mis inner = sc.new Mis();		// 建立內部類別物件
		System.out.println("學生人數 : " + inner.getNum());	
	}
}

