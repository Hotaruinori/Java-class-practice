package Part1.Basic6_Wrapper;
public class Wrapper03_ToString
{ 
    public static void main(String[] args) 
    {
        String str1,str2;
        int x=123, y=456;
        
        //使用Number類別的類別方法toString()將數值轉換成字串
        str1 = Integer.toString(x);
        str2 = Integer.toString(y);
        
        System.out.println(x + y);
        System.out.println(str1 + str2);
                       
        //使用String類別的類別方法valueOf()轉換成字串
        String s5 = String.valueOf(1234);
        String s6 = String.valueOf(1.23);
        System.out.println(s5);
        System.out.println(s6);
    }
}