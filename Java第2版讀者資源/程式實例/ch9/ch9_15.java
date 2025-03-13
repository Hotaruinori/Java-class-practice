class TaipeiBank {
	private String name;					// 開戶者姓名
	private int balance;					// 存款金額
	private int rate = 30;					// 匯率
	private double service_charge = 0.01;	// 手續費率
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
	public double usa_to_taiwan(int usaD) {	// 換匯計算
		if ( this.balance >= 10000 )		// 如果存款大於或等於10000元
			this.service_charge = 0.008;	// 手續費率0.008
		return cal_rate(usaD);
	}
	private double cal_rate(int usaD) {		// 真實計算換匯金額
		double result;
		result = usaD * rate * (1 - service_charge);	// 換匯結果
		return result;						// 回傳換匯結果
	}
	public void get_balance() {				// 列出開戶者的存款餘額
		System.out.println(name + " 目前存款餘額 " + balance);
	}
}
public class ch9_15 {
	public static void main(String[] args) {
		TaipeiBank A = new TaipeiBank("Hung");
		int usdallor = 50;
		A.saveMoney(5000);					// 存款5000
		System.out.println(usdallor + " 美金可以兌換 " + A.usa_to_taiwan(usdallor) 
							+ " 台幣 ");
		A.saveMoney(15000);					// 存款15000
		System.out.println(usdallor + " 美金可以兌換 " + A.usa_to_taiwan(usdallor) 
							+ " 台幣 ");
	}
}


