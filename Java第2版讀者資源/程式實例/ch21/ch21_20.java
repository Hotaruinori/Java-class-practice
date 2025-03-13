import java.util.Random;
class Factory {
	private int product;			// 產品
	private boolean empty;			// 判別庫存
	Factory() {
		this.empty = true;			// 庫存是空的
	}
	public synchronized void produce(int newProduct) {
		while (!this.empty) {
			try {
				wait();				// 有庫存生產需等待
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		product = newProduct;		// newProduct是產品
		System.out.println("生產 : " + newProduct);
		empty = false;
		notify();					// 有庫存通知可以消費		
		try {
			Thread.sleep(500);		// 睡眠0.5秒
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public synchronized void consume() {
		while (empty) {
			try {
				wait();				// 沒有庫存消費需等待
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		empty = true;
		System.out.println("消費 : " + product);
		notify();					// 沒有庫存通知可以生產	
		try {
			Thread.sleep(500);		// 睡眠0.5秒
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Consumer extends Thread {		// 消費類別
	private Factory factory;		// Factory類別是成員變數
	public Consumer(Factory factory) {
		this.factory = factory;
	}
	public void run() {
		int data;
		while (true) {				// 無限迴圈消費
			factory.consume();
		}
	}
}
class Producer extends Thread {		// 生產類別
  private Factory factory;			// Factory類別是成員變數
  public Producer(Factory factory) {
    this.factory = factory;
  }
  public void run() {
    Random rand = new Random();
    while (true) {					// 無限迴圈生產
      int n = rand.nextInt(1000);	
      factory.produce(n);
    }
  }
}
public class ch21_20 {
  public static void main(String[] args) {
    Factory factory = new Factory();
    Producer p = new Producer(factory);
    Consumer c = new Consumer(factory);
	System.out.println("同時按Ctrl+C可中斷程式");
    p.start();
    c.start();
  }
}






