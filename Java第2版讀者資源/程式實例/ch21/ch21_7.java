class HorseRacing implements Runnable {				// 實作Runnable介面
	private String name;
	HorseRacing(String name) {						// 建構方法
		this.name = name;							// 設定名稱
	}
	public void run() {								// 定義run方法
		for (int i = 1; i <= 1000; i++) 
			System.out.println(name + " 正在跑第 " + i + " 圈  ... ");
	}
}
public class ch21_7 {	
    public static void main(String args[]){
		HorseRacing hr1 = new HorseRacing("Horse1");// 建立HorsRacing物件
		HorseRacing hr2 = new HorseRacing("Horse2");// 建立HorsRacing物件
		Thread t1 = new Thread(hr1);				// 建立t1執行緒
		Thread t2 = new Thread(hr2);				// 建立t2執行緒
		t1.start();
		t2.start(); 
	}
}

