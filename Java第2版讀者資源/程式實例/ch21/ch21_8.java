class HorseRacing extends Thread {					// 繼承Thread類別
	HorseRacing(String name) {						// 建構方法
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
			System.out.println(getName() + " 正在跑第 " + i + " 圈  ... ");
		}
	}
}
public class ch21_8 {	
    public static void main(String args[]){
		HorseRacing t1 = new HorseRacing("Horse1");	// 建立執行緒物件
		HorseRacing t2 = new HorseRacing("Horse2");	// 建立執行緒物件
		t1.start();
		t2.start(); 
	}
}

