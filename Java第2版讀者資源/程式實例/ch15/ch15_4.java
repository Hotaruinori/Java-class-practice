class Animal {
	String name = "Dog";
	int age = 5;
}	
public class ch15_4 {
	public static void main(String[] args) {
		Animal A = new Animal();
		Animal B = new Animal();
		Animal C = B;
		System.out.println("A = B : " + A.equals(B));  	// 使用Object的equals
		System.out.println("A = C : " + A.equals(C));	// 使用Object的equals
		System.out.println("B = C : " + B.equals(C));	// 使用Object的equals
	}
}

