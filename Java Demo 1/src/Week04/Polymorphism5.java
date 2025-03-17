package Week04;
import java.util.Scanner;
public class Polymorphism5 {
	public static void main(String[] args) {
		System.out.println("請輸入1 or 2 or 3 的代號:");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//晚綁定
		A a = null;
		if (s.equals("1")) {
			a = new B();
		} else if (s.equals("2")) {
			a = new C();
		} else if (s.equals("3")) {
			a = new D();
		} else {
			System.out.println("謝謝光臨!");
			return;
		}
		a.method();		
		sc.close();
	}
}
class A {
	public void method() {
		System.out.println("A");
	}
}
class B extends A {
	public void method() {
		System.out.println("B");
	}
}
class C extends A {
	public void method() {
		System.out.println("C");
	}
}
class D extends A {
	public void method() {
		System.out.println("D");
	}
}
