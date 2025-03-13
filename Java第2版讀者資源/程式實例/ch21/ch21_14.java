class Demo {
	public synchronized void printDemo(int n) {
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
	Demo  PD;
	JobThread1(Demo pd) {					// 建構方法
		this.PD = pd;
	}  
	public void run() {						// 定義run方法
		PD.printDemo(10);					// 列印結果
	}
}
class JobThread2 extends Thread {			// 繼承Thread類別
	Demo  PD;
	JobThread2(Demo pd) {					// 建構方法
		this.PD = pd;
	}  
	public void run() {						// 定義run方法
		PD.printDemo(100);					// 列印結果
	}
}
public class ch21_14 {
	public static void main(String args[]) {
		Demo obj = new Demo();
		JobThread1 t1 = new JobThread1(obj);
		JobThread2 t2 = new JobThread2(obj);
		t1.start();
		t2.start();
	}
}



