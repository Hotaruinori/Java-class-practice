public class ch20_15 {
	public static String myTest() {
		try {
			return "明志科技大學";
		}
		finally {
			System.out.println("這是finally block");
			System.out.println("即使try區塊有return敘述也會執行");
		}
	}
	public static void main(String[] args) {
		System.out.println(ch20_15.myTest());
	}
}

