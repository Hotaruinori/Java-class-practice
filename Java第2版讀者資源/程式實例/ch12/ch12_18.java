public class ch12_18 {
	public static void main(String[] args) {
		String str1 = " Ming-Chi Institute of Technology ";
		String str2 = " 神鵰俠侶是楊過與郭襄的故事 ";
		String str3 = "\t大俠楊過\n";
		System.out.printf("使用trim前str1=/%s/\n", str1);
		String str4 = str1.trim();
		System.out.printf("使用trim後str4=/%s/\n", str4);
		System.out.printf("使用trim前str2=/%s/\n", str2);
		String str5 = str2.trim();
		System.out.printf("使用trim後str5=/%s/\n", str5);
		System.out.printf("使用trim前str3=/%s/\n", str3);
		String str6 = str3.trim();
		System.out.printf("使用trim後str6=/%s/\n", str6);
	}
}

