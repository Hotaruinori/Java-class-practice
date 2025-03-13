class XPriority extends Thread {						// 繼承Thread類別
	XPriority(String name) {							// 建構方法
		super(name);									// 設定名稱
	}
	public void run() {									// 定義run方法
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName() + " is running : " + i);
		}
	}
}
public class ch21_10 {	
    public static void main(String args[]){
		XPriority rabbit = new XPriority("Rabbit");		// 執行緒物件rabbit
		XPriority turtle = new XPriority("Turtle");		// 執行緒物件turtle
		XPriority horse = new XPriority("Horse");		// 執行緒物件horse
		System.out.println(rabbit.getName()+"優先順序值 : "+rabbit.getPriority());
		System.out.println(turtle.getName()+"優先順序值 : "+turtle.getPriority());
		System.out.println(horse.getName()+"優先順序值 : "+horse.getPriority());
		rabbit.setPriority(Thread.NORM_PRIORITY);		// 設定中優先
		turtle.setPriority(Thread.MIN_PRIORITY);		// 設定低優先
		horse.setPriority(Thread.MAX_PRIORITY);			// 設定高優先
		System.out.println(rabbit.getName()+"優先順序值 : "+rabbit.getPriority());
		System.out.println(turtle.getName()+"優先順序值 : "+turtle.getPriority());
		System.out.println(horse.getName()+"優先順序值 : "+horse.getPriority());
		rabbit.start();
		turtle.start();
		horse.start();
	}
}

