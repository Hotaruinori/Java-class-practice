public class ch18_1 {
	public static void main(String[] args) {
		int x = 5;						// 整數x
		String str = "wrapping";		// 建立字串str
		System.out.println("我是整數 x  " + x);
		System.out.println("我是字串str " + str);
		str = str + x;					// 字串與整數連接
		System.out.println("字串與整數的連接 " + str);
	}
}

