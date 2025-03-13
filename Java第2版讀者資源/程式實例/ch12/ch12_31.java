public class ch12_31 {
	public static void main(String[] args) {
		String str = "Java 入門邁向高手之路王者歸來";
		StringBuffer bstr = new StringBuffer(str);
		char[] ch = {'入', '門', '徹', '底', '研', '究', '之', '路'};
		bstr.getChars(7, 11, ch, 2);		
		System.out.print("bstr : ");
		for (char i:ch) 
			System.out.print(i);
	}
}
	
