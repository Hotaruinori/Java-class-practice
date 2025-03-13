public class ex6_6 {
	public static void main(String[] args) {				
		outerloop: for ( int i = 1; i <= 10; i++ ) {		// 有outerloop迴圈標記
			for ( int j = 10; j >= 1; j-- ) {
				System.out.print("*");						// 列印乘號
				if ( j <= i ) {
					System.out.println("");					// 下次輸出跳行
					continue outerloop;						// 這一輪outerloop迴圈中止
				}
			}		
		}				
	}
} 

