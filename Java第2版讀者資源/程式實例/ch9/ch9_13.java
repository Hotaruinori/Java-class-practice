class TaipeiBank {
	private String name;					// 開戶者姓名
	private int balance;					// 存款金額
	TaipeiBank(String name) {
		this.name = name;					// 設定開戶者姓名
		this.balance = 0;					// 設定開戶金額是0
	}
	void get_balance() {					// 列出開戶者的存款餘額
		System.out.println(name + " 目前存款餘額 " + balance);
	}
}
public class ch9_13 {
	public static void main(String[] args) {
		TaipeiBank A = new TaipeiBank("Hung");
		A.get_balance();
		A.balance = 1000;					// 設定存款金額
		A.get_balance();
	}
}

