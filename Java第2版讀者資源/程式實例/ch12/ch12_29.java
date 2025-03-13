public class ch12_29 {
	public static void main(String[] args) {
		String str = "Java";
		StringBuffer bstr = new StringBuffer(str);
		System.out.println("bstr : " + bstr);
		bstr.reverse();
		System.out.println("bstr : " + bstr);
	}
}
	
