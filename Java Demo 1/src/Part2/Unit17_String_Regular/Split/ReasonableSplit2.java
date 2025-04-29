//中文字串的合理切割
package Part2.Unit17_String_Regular.Split;
public class ReasonableSplit2
{ 
    public static void main(String[] args) 
    {
         String str= new String("程式設計範例");
         System.out.println();
         System.out.println("測試的中文字串: \"" + str + "\"");
         System.out.println();
         
         //以字元的處理
         char[] ch;
         System.out.println("分割成字元:");
         ch = str.toCharArray();
         for ( char element : ch)
         {
            System.out.println(element );
         }
         System.out.println();
         
         //使用子字串的處理方式
         String[] substr;
         System.out.println("以空字串分割成子字串:");
         substr = str.split("");
         for ( String element : substr )
         {
            System.out.println(element);
         }
    }
}
