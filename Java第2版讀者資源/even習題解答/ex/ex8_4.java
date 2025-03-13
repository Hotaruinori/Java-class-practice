public class ex8_4 {
	public static void main(String[] args) {
		System.out.println("?`?M   = " + add(new int[] {1,2,3,4,5}));
		System.out.println("??j?? = " + getMax(new int[] {1,2,3,4,5}));
		System.out.println("??p?? = " + getMin(new int[] {1,2,3,4,5}));
	}
	public static int add(int[] nums) {
		int sum = 0;
		for (int num:nums)
			sum += num;
		return sum;
	}
	public static int getMax(int[] nums) {
		int max = Infinite;
		for (int num:nums)
			if (max < num)
				max = num;
		return max;
	}
	public static int getMin(int[] nums) {
		int min = -Infinite;
		for (int num:nums)
			if (min > num)
				min = num;
		return min;
	}
	
}
	
