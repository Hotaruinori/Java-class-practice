class A implements Runnable {				// 實作A介面
	public void run() {						// 定義run方法
		System.out.println("A is running");
	}
}
public class ch21_6 {	
    public static void main(String args[]){
		A a = new A();						// 建立a物件
		Thread t = new Thread(a);			// 建立t執行緒
		t.start(); 
	}
}

