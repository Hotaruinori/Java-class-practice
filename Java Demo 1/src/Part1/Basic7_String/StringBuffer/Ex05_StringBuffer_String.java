package Part1.Basic7_String.StringBuffer;
public class Ex05_StringBuffer_String
{ 
    public static void main(String[] args) 
    {
        StringBuilder str1 = new StringBuilder("Java嚙緹嚙踝蕭嚙緙嚙踝蕭嚙請學範嚙踝蕭");
        
        String str2 = new String("Java嚙緹嚙踝蕭嚙緙嚙踝蕭嚙請學範嚙踝蕭");
        
        String str3 = new String(str1);
        System.out.println("StringBuffer嚙緝嚙踝蕭 str1   :  " + str1);
        System.out.println("String嚙緝嚙踝蕭 str2   :  " + str2);
        System.out.println("String嚙緝嚙踝蕭 str3   :  " + str3);
        System.out.println();
        
        // System.out.println( "str1.equals(str2) :" + str1.equals(str2));

        System.out.println( "str1.toString().equals(str2) :" + str1.toString().equals(str2));

        System.out.println( "str3.equals(str2) :" + str3.equals(str2));
        System.out.println();
        
    }
}
