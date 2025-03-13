class Bank{  
	int balance = 10000;  					// 存款餘額 
	synchronized void withdraw(int amount){ // 參數amount是提款金額 
		System.out.println("取款");  
		while (balance < amount) {  
			System.out.println("金額不足, 無法取款, 等待存款");  
			try{
				wait();						// 等待
			}
			catch(Exception e){
				System.out.println(e);
			}
		}  
		balance -= amount;  				// 計算提款後餘額
		System.out.println("取款完成");  
	}   
	synchronized void deposit(int amount){  
		System.out.println("存款");  
		balance += amount;  				// 加總存款餘額
		System.out.println("存款完成");  
		notify();  							// 通知
	}  
}    
public class ch21_19 {  
	public static void main(String args[]){  
		Bank bank = new Bank();  
		Thread t1 = new Thread(){  			// 提款物件
			public void run(){
				bank.withdraw(15000);   	// 提款15000
			}  
		};
		t1.start();  	
		Thread t2 = new Thread(){  			// 存款物件
			public void run(){
				bank.deposit(10000);		// 存款10000
			}  
		};
		t2.start();   
	}
}  



