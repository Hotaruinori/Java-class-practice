package Part2.Unit19_InnerClass.Local;
class Outer
{
    void method()
    {
        class Inner
        {
            public void showA()
            {
                System.out.println("Good morning!");
            }
           
            public void showB()
            {
                System.out.println("Hello!");
            }

            public void showC()
            {
                System.out.println("Hi!");
            }

        }
        
        new Inner().showA();  //建立內部類別的物件同時叫用成員
        new Inner().showB(); 
		new Inner().showC();
    }
}


public class LocalInner
{
    public static void main(String[] args)
    {
        Outer outer = new Outer();
        
        outer.method(); 
        System.out.println();    
    }
}