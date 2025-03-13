class TaipeiBank {
	private String name;					// 開戶者姓名
	private int balance;					// 存款金額
	private double rate = 30.0;				// 匯率
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
	public double taiwan_to_usa(int nt) {	// 換匯計算
		if ( this.balance >= 10000 )		// 如果存款大於或等於10000元
			this.service_charge = 0.008;	// 手續費率0.008
		return cal_rate(nt);
	}
	private double cal_rate(int nt) {		// 真實計算換匯金額
		double result;
		result = (nt - nt * service_charge) / rate;	// 換匯結果
		return result;						// 回傳換匯結果
	}
	public void get_balance() {				// 列出開戶者的存款餘額
		System.out.println(name + " 目前存款餘額 " + balance);
	}
}
public class ex9_2 {
	public static void main(String[] args) {
		TaipeiBank A = new TaipeiBank("Hung");
		int nt = 30000;
		int dollar = 5000;
		A.saveMoney(dollar);				// 存款5000
		System.out.println("當存款是 " + dollar);
		System.out.println(nt + " 台幣可以兌換 " + A.taiwan_to_usa(nt) 
							+ " 美金 ");
		dollar = 15000;					
		A.saveMoney(dollar);				// 存款15000
		System.out.println("當存款是 " + dollar);
		System.out.println(nt + " 台幣可以兌換 " + A.taiwan_to_usa(nt) 
							+ " 美金 ");
	}
}


