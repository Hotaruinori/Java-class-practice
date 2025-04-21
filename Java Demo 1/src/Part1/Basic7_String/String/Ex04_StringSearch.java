package Part1.Basic7_String.String;
public class Ex04_StringSearch
{ 
    public static void main(String[] args) 
    {
		String str1="Java 2";
        String str2= new String("嚙緹嚙踝蕭嚙稽嚙緘嚙請學範嚙踝蕭");
        System.out.println("嚙踝蕭嚙調迎蕭嚙稷嚙踝蕭r嚙踝蕭: \"" + str1 + "\"");
        System.out.println("嚙踝蕭嚙調迎蕭嚙踝蕭嚙踝蕭r嚙踝蕭: \"" + str2 + "\"");
        System.out.println();
        // 嚙篌嚙瞎嚙緝嚙踝蕭嚙瞎嚙締嚙緝嚙踝蕭
        System.out.println("嚙稷嚙踝蕭r嚙踝蕭indexOf(\'a\'): " + str1.indexOf('a'));
        System.out.println("嚙稷嚙踝蕭r嚙踝蕭indexOf(97): " + str1.indexOf(97));
        System.out.println("嚙稷嚙踝蕭r嚙踝蕭lastIndexOf(97): " + str1.lastIndexOf(97));
        System.out.println("嚙稷嚙踝蕭r嚙踝蕭indexOf(\'a\', 2): " + str1.indexOf('a', 2));
        System.out.println("嚙稷嚙踝蕭r嚙踝蕭lastIndexOf(\'H\'): " + str1.lastIndexOf('H'));
        System.out.println("嚙踝蕭嚙踝蕭r嚙踝蕭indexOf(\"嚙範嚙踝蕭\"): "+ str2.indexOf("嚙範嚙踝蕭"));
        System.out.println("嚙踝蕭嚙踝蕭r嚙踝蕭lastIndexOf(\"嚙範嚙踝蕭\"): "+ str2.lastIndexOf("嚙範嚙踝蕭"));
        System.out.println("嚙稷嚙踝蕭r嚙踝蕭indexOf(\"2\", 1): "+ str1.indexOf("2", 1));
        System.out.println("嚙稷嚙踝蕭r嚙踝蕭lastIndexOf(\"a\", 2): "+ str1.lastIndexOf("a", 2));
         
        System.out.println("嚙踝蕭嚙踝蕭r嚙踝蕭startsWith(\"嚙範嚙踝蕭\"): "+ str2.startsWith("嚙範嚙踝蕭"));
        System.out.println("嚙踝蕭嚙踝蕭r嚙踝蕭startsWith(\"嚙範嚙踝蕭\",6): "+ str2.startsWith("嚙範嚙踝蕭",6));         
        System.out.println("嚙踝蕭嚙踝蕭r嚙踝蕭endsWith(\"嚙範嚙踝蕭\"): "+ str2.endsWith("嚙範嚙踝蕭"));
    }
}