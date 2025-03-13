public class ch20_14 {
	public static void main(String[] args) {
		try {								// 沒有異常
			String str = "明志科技大學";
			char c = str.charAt(10);
			System.out.println("c字元是 : " + c);
		}
		catch(ArithmeticException e) {
			System.out.println("除數為0的錯誤" + e);
		}
		finally {
			System.out.println("一定會執行finally區塊");
		}
		System.out.println("ch20_14.java程式結束");
	}
}

