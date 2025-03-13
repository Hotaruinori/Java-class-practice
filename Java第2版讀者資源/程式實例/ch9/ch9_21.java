class PrintSample {	
	public static void output() {
		System.out.println("測試static方法");
	}
}

public class ch9_21 {
	public static void main(String[] args) {
		PrintSample.output();		// 類別名稱呼叫static方法
		PrintSample A = new PrintSample();
		A.output();					// 類別物件名稱呼叫static方法
	}
}
 
