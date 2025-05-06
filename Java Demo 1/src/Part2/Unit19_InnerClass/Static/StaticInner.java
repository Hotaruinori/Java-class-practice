package Part2.Unit19_InnerClass.Static;
class Outer{
    static int x=10;
    
    public static void method(){
        System.out.println("Hi!");
    }

    public void call_g_method(){
        new Inner().g();
    }
        
    public static class Inner
    {
        private void g(){
            System.out.println("This is g() method running\n");
        }
       
        public void h(){
            int x=15;
            System.out.println("This is h() method running");
            System.out.println("內部類別使用外部類別成員 x = " + Outer.x);
            System.out.println("內部類別使用外部類別成員 method()");
            Outer.method();
       }  
    }      
}


public class StaticInner
{
    public static void main(String[] args){
        Outer.Inner inn=new Outer.Inner();
        inn.h();
        
        //g()不對外開放
        //inn.g();
        System.out.println();
        new Outer().call_g_method();
        
               
   }    
}