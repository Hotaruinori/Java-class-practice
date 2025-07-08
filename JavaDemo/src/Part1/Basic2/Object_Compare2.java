package Part1.Basic2;
public class Object_Compare2 
{
    public static void main(String[] args) 
    {
        String str1=new String("ABCD");
        String str2=new String("ABCD");
        
        System.out.println("str1 == srt2  結果為 " + (str1==str2));
        System.out.println("str1.equals(str2)  結果為 " + (str1.equals(str2)));
        System.out.println("str2.equals(str1)  結果為 " + (str2.equals(str1)));       
    }
}
