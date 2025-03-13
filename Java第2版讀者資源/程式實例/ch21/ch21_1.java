public class ch21_1 {	
    public static void main(String args[]){
		Thread thread = Thread.currentThread();		// 建立目前執行緒物件
		System.out.println("目前執行緒名稱: " + thread.getName()); 
		thread.setName("MyThread");					// 更改執行緒名稱
		System.out.println("目前執行緒名稱: " + thread.getName()); 
		System.out.println("目前執行緒ID  : " + thread.getId()); 
	}
}

