class Bank {
	int balance = 10000;
}
class FirstBank extends Bank {			
	int balance = 50000;
}
public class ch14_30 {
	public static void main(String[] args) {
		Bank A = new FirstBank(); 	// Upcasting
		System.out.println(A.balance);	
	}
}

