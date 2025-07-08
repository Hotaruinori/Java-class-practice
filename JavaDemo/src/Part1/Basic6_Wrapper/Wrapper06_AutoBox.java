package Part1.Basic6_Wrapper;
public class Wrapper06_AutoBox
{
    public static void main(String[] args)
    {
        Integer ref1 = new Integer(20);  
        //Jdk5.0以前的寫法
        System.out.println(ref1.intValue());
        Integer ref2 = 20;   
        System.out.println(ref2.intValue());
        //Jdk5.0以後的寫法,稱為Autoboxing
    }
}
          