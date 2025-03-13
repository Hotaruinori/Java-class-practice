public class ch20_13 {
	public static void main(String[] args) {
		try {								
			String str = "明志科技大學";
			char c = str.charAt(10);		// 異常發生
			System.out.println("c字元是 : " + c);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("字串超出索引" + e);
		}
		finally {
			System.out.println("一定會執行finally區塊");
		}
	}
}

