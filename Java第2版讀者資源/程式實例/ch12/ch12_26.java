public class ch12_26 {
	public static void main(String[] args) {
		String str1 = "明志科技大學";
		StringBuffer bstr1 = new StringBuffer(str1);
		System.out.println(bstr1);
		StringBuffer bstr2 = new StringBuffer("明志科技大學");
		System.out.println(bstr2);
		CharSequence str2 = "台灣科技大學";
		StringBuffer bstr3 = new StringBuffer(bstr2);
		System.out.println(bstr3);		
	}
}

