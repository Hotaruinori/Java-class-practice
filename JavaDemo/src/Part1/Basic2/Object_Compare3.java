package Part1.Basic2;
public class Object_Compare3 
{
    public static void main(String[] args) 
    {
        // String str1=new String("ABHIJ");
        // String str2=new String("ABCDEFG");
       
        String str1=new String("ABCDF");
        String str2=new String("ABCDEFG");


        
        System.out.println("str1.compareTo(str2) 嚙踝蕭嚙瘦嚙踝蕭 " + (str1.compareTo(str2)));
        System.out.println("str2.compareTo(str1) 嚙踝蕭嚙瘦嚙踝蕭 " + (str2.compareTo(str1)));
        // 比較兩個字串的字典順序：
        // 1. 逐字符比較，返回第一個不同字符的 Unicode 差值 (thisChar - otherChar)
        // 2. 如果所有字符都相同，則返回長度差值 (this.length() - other.length())
    }
}



