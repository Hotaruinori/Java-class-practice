public class ch7_8 {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		int[] z = {1, 2, x + y};		// 以運算式當作陣列初值
		int sum = z[0] + z[1] + z[2];
		System.out.println("sum : " + sum);			
	}
}

