class TaipeiBank {
	int account;									// 帳號
	int balance;									// 存款金額
	void saveMoney(int save) {						// 存款
		balance += save;
	}		
	void printInfo( ) {								// 列印帳號與餘額
		System.out.printf("帳戶 : %d, 餘額 : %d\n", account, balance);		
	}
}

public class ch8_7 {
	public static void main(String[] args) {
		TaipeiBank A = new TaipeiBank();			// 類別物件
		A.account = 10000001;						// 設定帳號
		A.balance = 0;								// 最初化存款是0
		
		A.printInfo();								// 存款前
		A.saveMoney(100);							// 存款金額100
		A.printInfo();								// 存款後
	}
}

