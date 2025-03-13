public class ch12_3 {
	public static void main(String[] args) {
		char ch = '魁';	
		System.out.println("魁 是大寫字母 " + Character.isUpperCase(ch));
		System.out.println("魁 是小寫字母 " + Character.isLowerCase(ch));
		System.out.println("魁 是字母字元 " + Character.isLetter(ch));
		System.out.println("魁 是數字字元 " + Character.isDigit(ch));
		System.out.println("魁 是字母或數字 " + Character.isLetterOrDigit(ch));
	}
}

