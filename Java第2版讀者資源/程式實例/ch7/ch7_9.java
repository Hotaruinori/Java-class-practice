public class ch7_9 {
	public static void main(String[] args) {
		int[] z = new int[3];			// 以變數宣告陣列空間
		z[0] = z[1] = z[2] = z[3] = 2;
		int sum = z[0] + z[1] + z[2] + z[3];
		System.out.println("sum : " + sum);			
	}
}

