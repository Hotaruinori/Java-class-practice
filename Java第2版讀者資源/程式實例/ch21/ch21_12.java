class XDaemon extends Thread {							// 繼承Thread類別
	public void run() {									// 定義run方法
		if (Thread.currentThread().isDaemon()) {
			System.out.println(" Daemon Starting ... ");
			try {
				sleep(5000);							// 執行緒睡眠5秒
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}							// 休息
			System.out.println(" Daemon Exiting ... ");
		}
		else {
			System.out.println(" non-Daemon Starting ... ");
			System.out.println(" non-Daemon Exiting  ... ");
		}			
	}
}
public class ch21_12 {	
    public static void main(String args[]){
		XDaemon d = new XDaemon();						// 執行緒物件d
		XDaemon nd = new XDaemon();						// 執行緒物件nd
		d.setDaemon(false);								// 設為非Daemon執行緒
		d.start();
		nd.start();
	}
}

