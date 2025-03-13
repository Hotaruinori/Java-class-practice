public class ch15_5 {
	public static void main(String[] args) {
		String str1 = "明志科大";								// 定義String物件str1
		StringBuilder strB1 = new StringBuilder(str1);			// 定義StringBuilder物件msg2	
		String str2 = new String("明志科大");					// 定義String物件str2
		StringBuilder strB2 = new StringBuilder(str2);			// 定義StringBuilder物件str2
		
		System.out.println("使用String類別的equals : " + str1.equals(str2));
		System.out.println("使用Object類別的equals : " + strB1.equals(strB2));	
	}
}

