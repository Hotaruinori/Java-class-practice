public class ch12_25_1 {
	public static void main(String[] args) {
		String str = "I love Java.";
		String[] words = str.split("\\s"); 	// 使用空白切割成字串words陣列
		System.out.printf("str句子有 %d 個字\n", words.length);
		for (String w:words) {
			System.out.println(w);
		}
	}
}

