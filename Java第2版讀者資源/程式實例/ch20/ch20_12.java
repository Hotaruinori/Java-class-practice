public class ch20_12 {
	public static void main(String[] args) {
		try {								// 沒有異常
			String str = "明志科技大學";
			char c = str.charAt(3);
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

