public class ex12_4 {
	public static void main(String[] args) {
		String str = "神鵰俠侶是楊過與小龍女的故事,我喜歡小龍女在古墓的生活片段,小龍女清新脫俗美若天仙";
		int count = counter(str, "小龍女");
		System.out.println("小龍女出現次數 = " + count);
	}	
	public static int counter(String str, String substr) {
		int num = 0;
		int i = 0;
		while (str.indexOf(substr, i) != -1) {
			num++;
			i = str.indexOf(substr, i) + substr.length();
		}
		return num;
	}
}

