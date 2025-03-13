class TaipeiBank {
	int account;										// 帳號
	int balance;										// 存款金額
	void printInfo( ) {									// 方法printInfo()
		System.out.printf("帳戶 : %d, 餘額 : %d\n", account, balance);		
	}
}

public class ch8_4 {
	public static void main(String[] args) {
		TaipeiBank[] shilin = new TaipeiBank[5];		// 類別物件陣列
		
		for ( int i = 0; i < shilin.length; i++ ) {		// 建立帳號訊息
			shilin[i] = new TaipeiBank();				// 建立物件
			shilin[i].account = 10000001 + i;			// 設定帳號
			shilin[i].balance = 0;						// 最初化存款是0
		}
		for ( TaipeiBank sh:shilin )					// 列印帳號訊息
			sh.printInfo();
	}
}

