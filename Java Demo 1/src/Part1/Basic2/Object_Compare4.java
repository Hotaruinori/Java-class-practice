package Part1.Basic2;
class A {}

class B extends A {}  //B 嚙羯嚙踝蕭 A

public class Object_Compare4
{
	public static void main(String[] args)	
	{
        A obj1=new A();
        System.out.println(obj1 instanceof B);
         
          
        A obj2=new B();
        System.out.println(obj2 instanceof A); 
        System.out.println(obj2 instanceof B); 
    }
}
