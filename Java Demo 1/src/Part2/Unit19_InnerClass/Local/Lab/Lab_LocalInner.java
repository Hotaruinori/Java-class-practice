package Part2.Unit19_InnerClass.Local.Lab;
class Outer2
{
    Object method2()
    {
        class Inner
        {
            public void sayHi()
            {
                System.out.println("What's up ?");
            }
        }
        
        return new Inner();
    }
}


public class Lab_LocalInner
{
    public static void main(String[] args)
    {
        Outer2 outer = new Outer2();
        
        // Call Inner物件的 sayHi()
        // Insert code 
        Object innerObj = outer.method2();
        // ou.method2() 會回傳一個 Inner 的實例，但由於 Inner 是局部類別，無法直接在外面宣告 Outer2.Inner 型別，因此我們需要使用反射呼叫 sayHi() 方法，
        try {
            java.lang.reflect.Method sayHiMethod = innerObj.getClass().getMethod("sayHi");
            sayHiMethod.invoke(innerObj);
        } catch (Exception e) {
            e.printStackTrace();
        }
 
 
 
 
    }
}