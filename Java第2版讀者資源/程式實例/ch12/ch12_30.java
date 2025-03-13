public class ch12_30 {
	public static void main(String[] args) {
		String str = "Java 10入門邁向高手之路王者歸來";
		StringBuffer bstr = new StringBuffer(str);		
		System.out.println("bstr : " + bstr);
		bstr.setCharAt(6, '4');
		System.out.println("bstr : " + bstr);
		bstr.replace(7,9, "快樂學習");
		System.out.println("bstr : " + bstr);
	}
}
	
