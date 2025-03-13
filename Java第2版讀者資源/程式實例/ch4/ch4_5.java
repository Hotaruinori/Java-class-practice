public class ch4_5 {
	public static void main(String[] args) {
		int students = 20;
		int grapes = 90;
		int count = grapes / students;	// 每人分幾顆
		int left = grapes % students;	// 剩下幾顆
		System.out.println("每人分幾顆 = " + count);
		System.out.println("剩下幾顆   = " + left);
	}
}

