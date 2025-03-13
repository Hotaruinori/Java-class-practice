public class ch10_12 {
	public static void main(String[] args) {
		double rad = 0;					// 弳度		
		for ( int deg = 0; deg <= 360; deg += 45) {
			rad = Math.toRadians(deg); 
			System.out.printf("角度 %3d \t sin(%5.3f)= %10.8f \t cos(%5.3f) = %10.8f \n", 
							   deg, rad, Math.sin(rad), rad, Math.cos(rad));
		}
	}
}

