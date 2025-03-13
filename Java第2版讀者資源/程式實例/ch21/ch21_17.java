class Demo {
	synchronized static void printDemo(int n) {	// 同步靜態方法
        for(int i = 1; i <= 5; i++) {
            System.out.println("輸出 : "  + (i * n) );
			try {
				Thread.sleep(500);			// 睡眠0.5秒
			}
			catch(Exception e) {
				System.out.println(e);
			}
        }
	}
}
class JobThread1 extends Thread {			// 繼承Thread類別
	public void run() {						// 定義run方法
		Demo.printDemo(10);					// 列印結果
	}
}
class JobThread2 extends Thread {			// 繼承Thread類別
	public void run() {						// 定義run方法
		Demo.printDemo(100);				// 列印結果
	}
}
class JobThread3 extends Thread {			// 繼承Thread類別
	public void run() {						// 定義run方法
		Demo.printDemo(1000);				// 列印結果
	}
}
public class ch21_17 {
	public static void main(String args[]) {
		JobThread1 t1 = new JobThread1();
		JobThread2 t2 = new JobThread2();
		JobThread3 t3 = new JobThread3();
		t1.start();
		t2.start();
		t3.start();
	}
}



