package Part1.Basic3;
class MyTools
{
	static void showA()
    {
		System.out.println("嚙誹是 Static method");
		System.out.println("嚙編嚙諄改蕭: Class嚙磕嚙踝蕭.showA()");
	}
	
	void showB()
	{
        System.out.println("嚙誹是 Non-static method");
        System.out.println("嚙編嚙諄改蕭: Object嚙磕嚙踝蕭.showB()");
	}   
}


public class MethodCompared
{   
   public static void main(String[] args)
   {
	   System.out.println("嚙編嚙踝蕭嚙踝蕭嚙瞌嚙踝蕭k -");
	   MyTools.showA();
	   
	   System.out.println("\n");
	   System.out.println("嚙編嚙諄迎蕭嚙踝蕭嚙糊 -");
	   MyTools obj=new MyTools();
	   obj.showB();
   }
}
