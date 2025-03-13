class MyMath {									
	int math(int a, int b) {	 // int
		return a * b;
	}
	double math(int a, int b) {	 // double error
		return a * b;
	}
}
public class ch9_8_1 {
	public static void main(String[] args) {
		MyMath A = new MyMath();
		System.out.println(A.math(10, 10));	
	}
}
 
