class MyMath {
	int x;									
	void math(int a) {							// 含1個整數參數
		x = a;
	}
	void math(int a, int b) {					// 含2個整數參數
		x = a * b;
	}
	void math(int a, int b, int c) {			// 含3個整數參數
		x = a * b * c;
	}
	void printInfo( ) {							
		System.out.println(x);				
	}
}
public class ch9_8 {
	public static void main(String[] args) {
		MyMath A = new MyMath();
		A.math(10);
		A.printInfo();
		A.math(10, 10);
		A.printInfo();
		A.math(10, 10, 10);
		A.printInfo();	
	}
}
 
