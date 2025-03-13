public class ch8_15 {
	public static void main(String[] args) {
		int x = 10;										// main內的變數
		System.out.println("main內的變數 x = " + x);
		{												// 自訂區塊起點
			int y = 20;									// 區塊內的變數	
			System.out.println("main宣告的變數 x = " + x);
			System.out.println("區塊內的變數 y = " + y);
		}												// 自訂區塊終點
	}
}

