public class ch12_14_1 {
	public static void main(String[] args) {
		String str = "明志科技大學";
		CharSequence cs = "明志";
		System.out.println("str含cs字串 : " + str.contains(cs));
		System.out.println("str含- 字串 : " + str.contains("-"));
	}
}

