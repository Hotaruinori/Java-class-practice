public class ch12_14 {
	public static void main(String[] args) {
		String str = "神鵰俠侶是楊過與小龍女的故事我最喜歡小龍女在古墓的日子";
		String s = "小龍女";
		System.out.println("小龍女最先出現位置 = " + str.indexOf(s));
		System.out.println("小龍女最後出現位置 = " + str.lastIndexOf(s));
		System.out.println("小龍女在index=15起最先出現位置 = " + str.indexOf(s, 15));
		System.out.println("小龍女在index=15起最後出現位置 = " + str.lastIndexOf(s, 15));
		System.out.println("郭襄最先出現位置 = " + str.indexOf("郭襄"));
	}
}

