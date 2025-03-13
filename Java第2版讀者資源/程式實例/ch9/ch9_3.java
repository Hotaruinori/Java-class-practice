class TaipeiBank {
	int balance;							// 存款金額
	TaipeiBank() {							// 自建建構方法	
		balance = 0;						// 存款餘額初值是0
	}
	void printBalance() {					// 列印存款餘額
		System.out.println("存款餘額 : " + balance);
	}
}

public class ch9_3 {
	public static void main(String[] args) {
		TaipeiBank A = new TaipeiBank();	// 類別物件
		A.printBalance();					// 列印存款餘額
	}
}
 
