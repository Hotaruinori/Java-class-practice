public class ex19_2 {
	public static void main(String[] args) {
		double r;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.print("請輸入圓半徑 : ");
		r = scanner.nextDouble();				// 讀取半徑
		System.out.println("圓面積 : " + (Math.PI * r * r));
	}
}

