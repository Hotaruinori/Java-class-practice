class School {
	void college() {							// college()方法
		int students = 400;						// 學生人數
		class Mis {								// 定義資管系類別
			public int getNum() {
				return students;				// 傳回學生人數
			}
		}
		Mis inner = new Mis();					// 建立內部類別物件
		System.out.println("學生人數 : " + inner.getNum());
	}
}
public class ch14_37 {
	public static void main(String[] args) {
		School sc = new School();				// 定義School物件
		sc.college();
	}
}

