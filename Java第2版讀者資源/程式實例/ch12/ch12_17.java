public class ch12_17 {
	public static void main(String[] args) {
		String str1 = "Mjng-Chj Institute of Technology";
		String str2 = "Ming-Chi Institute of Technology";
		String str3 = "神鵰俠侶是楊過與郭襄的故事";
		String str4 = str1.replace('j', 'i');					// 字元取代
		String str5 = str2.replace("Institute", "University");	// 字串取代
		String str6 = str3.replace("郭襄", "小龍女");			// 中文字串取代
		System.out.println("str4 = " + str4);
		System.out.println("str5 = " + str5);
		System.out.println("str6 = " + str6);
	}
}

