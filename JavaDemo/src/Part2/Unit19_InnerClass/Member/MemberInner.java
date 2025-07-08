package Part2.Unit19_InnerClass.Member;
class Nana
{
    int x=10;
    
    public String sayHi()
    {
    	return "Hello";
    }
   
    class Inner
    {
        int x=20;
        public void h()
        {
            int x=30;
            System.out.println("This is h() method running\n");
            System.out.println("叫用外部類別屬性 x = " + Nana.this.x);
            System.out.println("叫用外部類別成員方法 sayHi() = " +  Nana.this.sayHi());
            System.out.println("叫用自身類別屬性 x = " + this.x);
            System.out.println("叫用區域變數 x = " + x);
        }
    }
}


public class MemberInner
{
    public static void main(String[] args)
    {
        // Nana outer=new Nana();
        // Nana.Inner inn=outer.new Inner();
        /*******************************************/
        Nana.Inner inn = new Nana().new Inner();
       
        inn.h();
        System.out.println();
    }
}
