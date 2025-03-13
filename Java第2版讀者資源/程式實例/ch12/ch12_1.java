public class ch12_1 {
	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = '5';		
		System.out.println("A 是大寫字母 " + Character.isUpperCase(ch1));
		System.out.println("A 是小寫字母 " + Character.isLowerCase(ch1));
		System.out.println("A 是字母字元 " + Character.isLetter(ch1));
		System.out.println("A 是數字字元 " + Character.isDigit(ch1));
		System.out.println("5 是數字字元 " + Character.isDigit(ch2));
		System.out.println("5 是字母或數字 " + Character.isLetterOrDigit(ch2));
		System.out.println("A 是字母或數字 " + Character.isLetterOrDigit(ch1));
	}
}

