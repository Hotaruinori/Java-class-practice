package Part1.Basic7_String.String;
public class Ex03_StringCase
{ 
    public static void main(String[] args) 
    {
         String str1="Java programming language";
         String str2= new String("嚙緹嚙踝蕭嚙稽嚙緘嚙請學範嚙踝蕭");
         // 嚙踝蕭雃r嚙踝蕭嚙踝蕭蚸M嚙篌嚙緘嚙篇嚙賞換
         System.out.println("嚙踝蕭嚙調迎蕭嚙稷嚙踝蕭r嚙踝蕭: \"" + str1 + "\"");
         System.out.println("嚙踝蕭嚙調迎蕭嚙踝蕭嚙踝蕭r嚙踝蕭: \"" + str2 + "\"");
         System.out.println();
         System.out.println("嚙稷嚙踝蕭r嚙踝蕭嚙踝蕭嚙�: " + str1.length());
         System.out.println("嚙踝蕭嚙踝蕭r嚙踝蕭嚙踝蕭嚙�: " + str2.length());
         System.out.println();
         System.out.println("嚙踝蕭嚙踝蕭嚙緘嚙篇: " + str1.toLowerCase());
         System.out.println("嚙踝蕭嚙踝蕭嚙篌嚙篇: " + str1.toUpperCase());
    }
}