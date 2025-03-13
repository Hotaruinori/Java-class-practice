public class ch6_12 {
	public static void main(String[] args) {
		int sum = 0;				// 總和
		for ( int i = 1; i <= 10; i++ ) {
			if ( i % 2 == 0 )		// 如果等於0則是偶數
				continue;
			sum += i;				// 與目前總和相加
		}
		System.out.println("1-10奇數總和是 : " + sum);		
	}
}

