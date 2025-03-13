class HorseRacing extends Thread {					// 繼承Thread類別
	private String name;
	HorseRacing(String name) {						// 建構方法
		super(name);								// 設定名稱
	}
	public void run() {								// 定義run方法
		for (int i = 1; i <= 1000; i++) 
			System.out.println(getName() + " 正在跑第 " + i + " 圈  ... ");
	}
}
public class ch21_5 {	
    public static void main(String args[]){
		HorseRacing t1 = new HorseRacing("Horse1");	// 建立執行緒物件
		HorseRacing t2 = new HorseRacing("Horse2");	// 建立執行緒物件
		t1.start();
		t2.start(); 
	}
}

