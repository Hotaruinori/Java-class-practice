class Bank {
	public double RateInterest() {		// 	Bank類別的利率()方法	
		return 0;
	}
}
class FirstBank extends Bank {			
	public double RateInterest() {		// 重新定義利率()方法	
		return 1.05;
	}
}
class TaishinBank extends Bank {			
	public double RateInterest() {		// 重新定義利率()方法	
		return 1.1;
	}
}
public class ch14_28 {
	public static void main(String[] args) {
		Bank A = new Bank();
		System.out.println("Bank利率 : " + A.RateInterest());
		A = new FirstBank();
		System.out.println("First Bank利率 : " + A.RateInterest());
		A = new TaishinBank();
		System.out.println("Taishin Bank利率 : " + A.RateInterest());
	}
}

