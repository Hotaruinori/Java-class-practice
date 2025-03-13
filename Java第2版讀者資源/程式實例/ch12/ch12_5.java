public class ch12_5 {
	public static void main(String[] args) {
		char ch = '1';
		System.out.println("1 在16進位中所代表的數值" + Character.digit(ch, 16));
		System.out.println("9 在16進位中所代表的數值" + Character.digit('9', 16));
		System.out.println("A 在16進位中所代表的數值" + Character.digit('A', 16));
		System.out.println("F 在16進位中所代表的數值" + Character.digit('F', 16));
		System.out.println("G 在16進位中所代表的數值" + Character.digit('G', 16));
	}
}

