public class ch8_8 {
	public static void swap(int x, int y) {
		int tmp = x;								// 以下2行可以達到x,y資料對調
		x = y;
		y = tmp;
		System.out.printf("swap方法內部   x = %d,  y = %d\n", x, y);
	}
	public static void main(String[] args) {
		int x, y;
		x = 10;
		y = 20;
		System.out.printf("呼叫swap方法前 x = %d,  y = %d\n", x, y);
		swap(x, y);									// 呼叫swap方法前
		System.out.printf("呼叫swap方法後 x = %d,  y = %d\n", x, y);
	}
}

