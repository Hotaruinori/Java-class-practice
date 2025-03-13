public class ch21_18 {
	public static void main(String args[]) {
		String str1 = "Account";			// 資源1
		String str2 = "Pwdword";			// 資源2
		Thread t1 = new Thread() {			// 想先後鎖住Account, Pwdword		
			public void run() {				// 定義run方法
				synchronized(str1) {
					System.out.println("執行緒1: 鎖住Account");
					try {
						Thread.sleep(300);		// 睡眠0.3秒
					}
					catch(Exception e) {
						System.out.println(e);
					}
					synchronized(str2) {
						System.out.println("執行緒1: 鎖住Pwdword");
					}
				}
			}
		};
		Thread t2 = new Thread() {			// 想先後鎖住Pwdword, Account		
			public void run() {				// 定義run方法
				synchronized(str2) {
					System.out.println("執行緒2: 鎖住Pwdword");
					try {
						Thread.sleep(300);		// 睡眠0.3秒
					}
					catch(Exception e) {
						System.out.println(e);
					}
					synchronized(str1) {
						System.out.println("執行緒2: 鎖住Account");
					}
				}
			}
		}; 
		t1.start();
		t2.start();
	}
}



