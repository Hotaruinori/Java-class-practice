class MyException extends Exception {			// MyException類別
	String str;
	MyException(String msg) {					// 將訊息傳給str
		str = msg;
	}
	public String toString( ) {
		return ("我定義的MyException發生了 " + str);
	}
}
public class ch20_23 {
	public static void main(String[] args) {	
		try {
			System.out.println("try區塊");
			throw new MyException("異常訊息");	// 拋出異常的敘述
		}
		catch(MyException e) {					// MyException異常
			System.out.println("catch區塊");
			System.out.println("MyException : " + e);
			e.printStackTrace();				// 回溯輸出
		}
	}
}

