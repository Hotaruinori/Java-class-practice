public class ch4_3 {
	public static void main(String[] args) {
		int x = 25, y = 3, z;
		double f;
		z = x + y;
		System.out.println("加法結果z = " + z);	
		z = x - y;
		System.out.println("減法結果z = " + z);	
		z = x * y;
		System.out.println("乘法結果z = " + z);	
		z = x / y;
		System.out.println("除法結果z = " + z);		
		f = x / y;
		System.out.println("整數除法結果f = " + f);		
		f = 25.0 / 3.0;
		System.out.println("浮點數除法結果f = " + f);		
		System.out.printf("格式化浮點數除法結果f = %5.2f", f);	
	}
}

