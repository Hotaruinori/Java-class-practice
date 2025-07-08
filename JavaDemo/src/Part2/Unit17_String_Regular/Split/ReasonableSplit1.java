//英文字串的合理切割
package Part2.Unit17_String_Regular.Split;
public class ReasonableSplit1
{ 
    public static void main(String[] args) 
    {
         String str1 = "Java language is good!";
         String str2 = "iabcloveebcyouwbcsotbcmuch";
         System.out.println();
         System.out.println("測試的英文字串1: \"" + str1 + "\"");
         System.out.println("測試的英文字串2: \"" + str2 + "\"");
         System.out.println();
         
         //子字串的處理
         String[] substr1;
         System.out.println("以空白分割字串1:");
         substr1 = str1.split(" ");
         
         for ( String element : substr1 )
         {
            System.out.println(element);
         }
         System.out.println();
         
         
         String[] substr2;
         System.out.println("以\".bc\"分割字串2:");
         substr2 = str2.split(".bc");
         
         for ( String element : substr2 )
         {
            System.out.println(element);
         }
         System.out.println();
    }
}
