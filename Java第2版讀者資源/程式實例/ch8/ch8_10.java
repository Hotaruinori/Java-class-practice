class TaipeiBank {
	int account;									// 帳號
	int balance;									// 存款金額
	Boolean saveMoney(int save) {					// 存款
		if (save > 0) {								// 存款金額大於0
			balance += save;						// 執行存款
			return true;							// 傳回true
		}
		else 
			return false;							// 否則傳回false	
	}		
	void printInfo( ) {								// 列印帳號與餘額
		System.out.printf("帳戶 : %d, 餘額 : %d\n", account, balance);		
	}
}

public class ch8_10 {
	public static void main(String[] args) {
		TaipeiBank A = new TaipeiBank();			// 類別物件
		A.account = 10000001;						// 設定帳號
		A.balance = 0;								// 最初化存款是0
		
		A.printInfo();								// 存款前
		System.out.println("存款" + 
			((A.saveMoney(100)) ? "成功":"失敗"));	// 存款金額100
		A.printInfo();								// 存款100後
		System.out.println("存款" + 
			((A.saveMoney(-100)) ? "成功":"失敗"));	// 存款金額-100
		A.printInfo();								// 存款-100後
	}
}

