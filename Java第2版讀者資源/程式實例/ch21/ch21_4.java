class HorseRacing {									
	private String name;							// 馬匹名稱變數
	HorseRacing(String name) {						// 建構方法
		this.name = name;							// 設定馬匹名稱
	}
	public void run() {								// 定義run方法
		for (int i = 1; i <= 10; i++)				// 設定跑10圈
			System.out.println(name + " 正在跑第 " + i + " 圈  ... ");
	}
}
public class ch21_4 {	
    public static void main(String args[]){
		HorseRacing t1 = new HorseRacing("Horse1");	// 建立Horse1物件
		HorseRacing t2 = new HorseRacing("Horse2");	// 建立Horse2物件
		t1.run();
		t2.run(); 
	}
}

