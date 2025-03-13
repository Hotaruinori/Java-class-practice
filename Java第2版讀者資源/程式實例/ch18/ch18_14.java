public class ch18_14 {
	public static void main(String[] args) {
		int i = Integer.parseInt("127");
		int i2 = Integer.parseInt("101", 2);		// 字串是2進制
		int i8 = Integer.parseInt("101", 8);		// 字串是8進制
		int i16 = Integer.parseInt("101", 16);		// 字串是16進制
		double d = Double.parseDouble("100.0123");	// 字串是Double類別
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i8);
		System.out.println(i16);
		System.out.println(d);
	}
}

