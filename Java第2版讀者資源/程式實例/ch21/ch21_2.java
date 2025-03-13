class MultiThread extends Thread {
	public void run() {							// 重新定義run方法
		System.out.println("Thread運行中 ...");
	}
}
public class ch21_2 {	
    public static void main(String args[]){
		MultiThread t = new MultiThread();		// 建立目前執行緒物件
		t.start();
		System.out.println("列出預設的執行緒名稱: " + t.getName()); 
	}
}

