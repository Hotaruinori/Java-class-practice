public class ch8_22 {
	public static void main(String[] args) {
		System.out.println(add(new int[] {1,2,3,4,5}));
	}
	public static int add(int[] nums) {
		int sum = 0;
		for (int num:nums)
			sum += num;
		return sum;
	}
}

