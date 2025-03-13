class NotEnoughException extends Exception {	// 自行定義異常
	private int shortAmount;					// 異常時所欠金額
	public NotEnoughException(int shortAmount) {
		this.shortAmount = shortAmount;			// 設定所欠餘額
	} 
	public double getShortAmount() {			// 取得所欠餘額
		return shortAmount;						// 傳回所欠餘額
	}
}
class MyBank {						 
	private int balance;						// 存款餘額
	public void deposit(int cashin) {			// 存款
		balance += cashin;
	}
	public void withdraw(int cashout) throws NotEnoughException { // 提款
		if(cashout <= balance) {				// 檢查提款是否小於存款餘額
			balance -= cashout;					// true帳戶正常扣款
		}
		else {									// false
			int shortA = cashout - balance;		// 計算短少金額
			throw new NotEnoughException(shortA);	// 拋出異常將短少金額給異常類別
		}
	}
	public double getBalance() {				// 傳回餘額
		return balance;
	}
}
public class ch20_24 {
	public static void main(String [] args) {
		MyBank obj = new MyBank();
		System.out.println("存款1000元 ... ");
		obj.deposit(1000);
		try {
			System.out.println("提款500元 ... ");
			obj.withdraw(500);
			System.out.println("提款600元 ... ");
			obj.withdraw(600);
		} 
		catch(NotEnoughException e) {
			System.out.println("存款金額不足 : " + e.getShortAmount());
			e.printStackTrace();
		}
    }
}
