package Week05;
// 繼承 Thread 類別


public class Tread {
	public static void main(String[] args) {
		HorseRacing t1 = new HorseRacing();
		HorseRacing t2 = new HorseRacing();
		t1.setName("黑馬");
		t2.setName("白馬");
		t1.start();
		t2.start();
	}
}

class HorseRacing extends Thread{		
	public void run() {
		for(int i = 1; i <=1000; i++) {
			System.out.println(getName() + " 正在跑第 " + i + "圈...");
		}
	}
}
