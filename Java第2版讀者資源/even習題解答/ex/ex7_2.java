public class ex7_2 {
	public static void main(String[] args) {
		int[] data = {23, 99, 38, 9, 10, 22, 87, 25, 77};			
		int tmp;									
		for ( int i = 0; i < (data.length - 1); i++ )  {
			for ( int j = 0; j < (data.length - 1); j++ ) {
				if ( data[j] < data[j+1] ) {		// 發生前面元素比後面元素小
					tmp = data[j];
					data[j] = data[j+1];			// 較大的元素值放前面
					data[j+1] = tmp;				// 較小的元素值放後面
				}
			}
		}
		System.out.printf("最大值 = %d%n", data[0]);
		System.out.printf("最小值 = %d%n", data[data.length-1]);
		int middle = data.length / 2;
		System.out.printf("中間值 = %d%n", data[middle]);
	}
}

