public class ch12_16 {
	public static void main(String[] args) {
		String str = "神鵰俠侶是楊過與小龍女的故事";
		char[] ch = new char[15];
		str.getChars(5, 11, ch, 0);
		System.out.println(ch);
	}
}

