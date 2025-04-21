package Part1.Basic7_String.String;
public class Ex06_StringSplit
{ 
    public static void main(String[] args) 
    {
        String str="Java language";
        String[] str1;
        String[] str2;
        char[] ch;
        byte[] by;
        System.out.println("嚙踝蕭嚙調迎蕭嚙稷嚙踝蕭r嚙踝蕭: \"" + str + "\"");
        System.out.println();
         
        //嚙踝蕭嚙諄佗蕭嚙締嚙緝嚙踝蕭
        str1 = str.split("a");
        System.out.println();
        System.out.println("嚙踝蕭嚙踝蕭嚙稷嚙踝蕭r嚙赭的a:");
        for(int x=0; x<str1.length; x++)
        {
			System.out.println(str1[x]);
        } 
        System.out.println();
         
        //嚙踝蕭嚙諄佗蕭嚙踝蕭r嚙踝蕭
        str2 = str.split(" ");
        System.out.println();
        System.out.println("嚙踝蕭嚙踝蕭嚙稷嚙踝蕭r嚙赭的嚙褐伐蕭:");
        for(int x=0; x<str2.length; x++)
        {
            System.out.println(str2[x]);
        } 
         
        //嚙踝蕭嚙諄佗蕭嚙緝嚙踝蕭
        ch = str.toCharArray();
        System.out.println();
        System.out.println("嚙瞇嚙稷嚙踝蕭r嚙踝蕭嚙踝蕭峖嚙踝蕭r嚙踝蕭:");
        for(int x=0; x<ch.length; x++)
        {
            System.out.print(ch[x]+"   ");
        } 
        System.out.println();
         
        //嚙踝蕭嚙諄佗蕭byte
        by = str.getBytes();
        System.out.println();
        System.out.println("嚙瞇嚙稷嚙踝蕭r嚙踝蕭嚙踝蕭峖嚙箭yte:");
        for(int x=0; x<by.length; x++)
        {
            System.out.print(by[x]+"  ");
        } 
        System.out.println("\n");
         
        System.out.println("嚙磋嚙踝蕭嚙緝嚙踝蕭e嚙賦的嚙褐伐蕭:");
        String s1="    abcde fghij    ";
        String s2="  abcde";
        System.out.println(s1 + s2);
        System.out.println(s1.trim() + s2.trim());                
    }
}