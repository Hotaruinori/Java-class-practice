package Part1.Basic6_Wrapper;
public class Wrapper01_Integer
{
    public static void main(String[] args)
    {
        Integer obj = 514;
        // Integer obj = new Integer(123);
        //Integer obj = new Integer(130);
        
        System.out.println("原來的int值:");
        System.out.println(obj.intValue());
        System.out.println(obj.byteValue());  //-128~127 
        System.out.println(obj.shortValue()); // -32768~32767
        System.out.println(obj.longValue());
        System.out.println(obj.floatValue());
        System.out.println(obj.doubleValue());
        System.out.println();
        
        /*
        byte x=123;
        Byte obj2 = new Byte(x);
        
        short y=123;
        Short obj3 = new Short(y);
        */
   }
} 
