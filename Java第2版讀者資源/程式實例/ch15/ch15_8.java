class MyClass {
}
public class ch15_8 {
	public static void main(String[] args) {
		char[] ch = {'明', '志', '科', '技', '大', '學'};
		String str = new String(ch);			
		MyClass obj = new MyClass();
		System.out.println("ch 類別 : " + str.getClass());
		System.out.println("obj類別 : " + obj.getClass());
	}
}

