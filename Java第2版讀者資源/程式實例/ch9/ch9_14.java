class TaipeiBank {
	private String name;					// 開戶者姓名
	private int balance;					// 存款金額
	public TaipeiBank(String name) {
		this.name = name;					// 設定開戶者姓名
		this.balance = 0;					// 設定開戶金額是0
	}
	public void saveMoney(int money) {		// 存款
		this.balance += money;
	}
	public void withdrawMoney(int money) {	// 提款
		this.balance -= money;
	}
	public void get_balance() {				// 列出開戶者的存款餘額
		System.out.println(name + " 目前存款餘額 " + balance);
	}
}
public class ch9_14 {
	public static void main(String[] args) {
		TaipeiBank A = new TaipeiBank("Hung");
		A.get_balance();
		A.saveMoney(1000);					// 存款1000
		A.get_balance();
		A.withdrawMoney(500);				// 提款500
		A.get_balance();
	}
}

