public class ch8_21 {
	public static void main(String[] args) {
		int[] data = {1, 2, 3, 4, 5};
		System.out.println(add(data));
	}
	public static int add(int[] nums) {
		int sum = 0;
		for (int num:nums)
			sum += num;
		return sum;
	}
}

