class Bank {
	public void demoInterest() {		// 	列印利率
		System.out.println("Bank利率 : " + 0);
	}
}
class FirstBank extends Bank {			
	public void demoInterest() {		// 列印利率	
		System.out.println("Bank利率 : " + 1.05);
	}
}
public class ch14_29 {
	public static void main(String[] args) {
		Bank A = new Bank();
		A.demoInterest();
		FirstBank B = new FirstBank();
		B.demoInterest();	
		A = B;							// 更改參考
		A.demoInterest();
	}
}

