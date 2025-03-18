package Week04;


public class Interface2 {

	public static void main(String[] args) {
		MyClass222 myclass222 = new MyClass222();
		myclass222.output();
		myclass222.output2();
	}	
}

interface MyInterface111
{
	public void output();
}

interface MyInterface222
{
	public void output2();
}

class MyClass222 extends MyParent implements MyInterface111, MyInterface222 
{
	public void output() {
		System.out.println("output1");
		
	}	
	public void output2() {
		System.out.println("output2");
		
	}	
}
class MyParent{
	public void output2() {
		System.out.println("output2");		
	}	
}
