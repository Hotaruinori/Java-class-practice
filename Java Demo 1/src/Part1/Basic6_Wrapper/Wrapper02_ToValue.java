package Part1.Basic6_Wrapper;
public class Wrapper02_ToValue
{ 
    public static void main(String[] args) 
    {
        String str1 = "128";
        String str2 = "456.78";
        
        /* 使用Number類別方法parseXXX()將字串轉換成數值 */
        int    n1 = Integer.parseInt(str1);        
        double n2 = Double.parseDouble(str2);
           
        /* 使用Number類別方法valueOf()將字串轉換成Number物件 */
        int    n3 = Integer.valueOf(str1).intValue();
        double n4 = Double.valueOf(str2).doubleValue();
    }
}