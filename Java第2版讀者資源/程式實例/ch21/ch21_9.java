class Xjoin extends Thread {						// 繼承Thread類別
	Xjoin(String name) {							// 建構方法
		super(name);								// 設定名稱
	}
	public void run() {								// 定義run方法
		for (int i = 1; i <= 5; i++) {
			try {
				sleep(500);							// 執行緒睡眠0.5秒
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(getName() + " is running : " + i);
		}
	}
}
public class ch21_9 {	
    public static void main(String args[]){
		Xjoin job1 = new Xjoin("Job1");				// 建立執行緒物件job1
		Xjoin job2 = new Xjoin("Job2");				// 建立執行緒物件job2
		Xjoin job3 = new Xjoin("Job3");				// 建立執行緒物件job3
		job1.start();
		try {										
			job1.join();							// Job1優先執行到結束
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		job2.start();
		job3.start();
	}
}

