class MyException extends Exception {			// MyException類別
	
}
public class ch20_22 {
	public static void main(String[] args) {	
		try {
			System.out.println("try區塊");
			throw new MyException();			// 拋出異常
		}
		catch(MyException e) {					// MyException異常()
			System.out.println("catch區塊");
			System.out.println("我的異常類別MyException : " + e);
			e.printStackTrace();				// 回溯輸出
		}
	}
}

