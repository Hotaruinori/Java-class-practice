public class ch7_6 {
	public static void main(String[] args) {
		int x = 3;
		int[] z = new int[x];			// 以變數宣告陣列空間
		z[0] = z[1] = z[2] = 2;
		int sum = z[0] + z[1] + z[2];
		System.out.println("sum : " + sum);			
	}
}

