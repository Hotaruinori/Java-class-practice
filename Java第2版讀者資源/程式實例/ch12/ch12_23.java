public class ch12_23 {
	public static void main(String[] args) {
		String str1 = "Ming-Chi Institute of Technology";
		System.out.println("前綴詞是Ming-Chi   : " + str1.startsWith("Ming-Chi"));
		System.out.println("前綴詞是MING-CHI   : " + str1.startsWith("MING-CHI"));
		System.out.println("後綴詞是Technology : " + str1.endsWith("Technology"));
		System.out.println("後綴詞是TECHNOLOGY : " + str1.endsWith("TECHNOLOGY"));
		System.out.println("Index 9是Institute : " + str1.startsWith("Institute", 9));
		System.out.println("Index 9是INSTITUTE : " + str1.startsWith("INSTITUTE", 9));
	}
}

