public class ch8_17 {
	public static void main(String[] args) {
		int x = 10;										// main內的變數
		System.out.println("main內的變數 x = " + x);
		{												// 自訂區塊起點
			int x = 15;									// error!因為重複宣告 
			int y = 20;									// 區塊內的變數	
			System.out.println("區塊內的變數 y = " + y);
		}												// 自訂區塊終點
	}
}

