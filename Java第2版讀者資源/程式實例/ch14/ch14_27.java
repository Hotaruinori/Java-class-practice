class School {
	public void demo() {				// 	父類別的demo()方法	
		System.out.println("明志科大");
	}
}
class Department extends School {			
	public void demo() {				// 重新定義父類別的demo()方法	
		System.out.println("明志科大機械系");
	}
}
public class ch14_27 {
	public static void main(String[] args) {
		School A = new School();
		School B = new Department();	// Upcasting
		A.demo();						// 調用父類別demo()方法
		B.demo();						// 調用子類別demo()方法
	}
}

