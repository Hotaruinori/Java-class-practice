public class ch12_13 {
	public static void main(String[] args) {
		String str = "Ming-Chi Institute of Technology";		
		System.out.println("i字元最先出現位置 = " + str.indexOf('i'));
		System.out.println("i字元最後出現位置 = " + str.lastIndexOf('i'));
		System.out.println("i字元在index=5起最先出現位置 = " + str.indexOf('i', 5));
		System.out.println("i字元在index=5起最後出現位置 = " + str.lastIndexOf('i', 5));
		System.out.println("i字元在index=7起最先出現位置 = " + str.indexOf('i', 7));
		System.out.println("i字元在index=7起最後出現位置 = " + str.lastIndexOf('i', 7));
		System.out.println("k字元最先出現位置 = " + str.indexOf('k'));
		System.out.println("z字元最後出現位置 = " + str.lastIndexOf('z'));
	}
}

