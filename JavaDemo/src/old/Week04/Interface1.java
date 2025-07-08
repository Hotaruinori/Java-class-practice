package Week04;
public class Interface1 {
	public static void main(String[] args) {
		MyClass222 myclass = new MyClass222();
		myclass.output();
	}	
}

interface MyInterface
{
	public void output();
}

class MyClass implements MyInterface111
{
	public void output() {
		System.out.println("output");
		
	}	
}
