class MultiThread extends Thread {
	MultiThread(String name) {						// 建構方法
		super(name);								// 設定執行緒名稱
	}
	public void run() {								// 重新定義run方法
		System.out.println("Thread運行中 ...");
	}
}
public class ch21_3 {	
    public static void main(String args[]){
		MultiThread t = new MultiThread("Horse");	// 建立目前執行緒物件
		t.start();
		System.out.println("列出預設的執行緒名稱: " + t.getName()); 
	}
}

