public class ch7_18 {
	public static void main(String[] args) {
		int[] x = {6, 9, 2};				// 定義整數陣列
		System.out.println("原先x陣列內容");
		for (int num:x)
			System.out.printf("%d\t", num);
		
		System.out.printf("\n更改參照和新的x陣列內容\n");
		x = new int[2];						// 更改參照
		x[0] = 10;
		x[1] = 20;
		for (int num:x)
			System.out.printf("%d\t", num);
	}
}

