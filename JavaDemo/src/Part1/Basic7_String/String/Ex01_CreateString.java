package Part1.Basic7_String.String;
public class Ex01_CreateString
{ 
    public static void main(String[] args) 
    {
        //嚙諍立陣嚙瘠
        char[] charArray = { 'J', 'a', 'v', 'a', ' ', '2' };
        byte[] byteArray = { 74, 65, 86, 65, 32, 50 };   // J A V A   2
        StringBuffer strbuf=new StringBuffer("JSP嚙褊態嚙踝蕭嚙踝蕭嚙稽嚙緘");
        
        String str1 = "Java嚙緹嚙踝蕭嚙稽嚙緘";
        //嚙誕用建構嚙諍立字嚙赭物嚙踝蕭
        String str2 = new String("Java嚙緹嚙踝蕭嚙稽嚙緘");
        String str3 = new String(charArray);         //嚙誕用字嚙踝蕭嚙罷嚙瘠
        String str4 = new String(byteArray);         //嚙誕伐蕭byte嚙罷嚙瘠
        String str5 = new String(strbuf);   
       
        System.out.println("String str1: " + str1);
        System.out.println();
        System.out.println("String(str2): " + str2);
        System.out.println();
        System.out.println("String(charArray): " + str3);
        System.out.println();
        System.out.println("String(charArray,1,3): " + new String(charArray,1,3));
        System.out.println();
        System.out.println("String(byteArray): " + str4);
        System.out.println();
        System.out.println("String(byteArray,2,4): " + new String(byteArray,2,4));
        System.out.println();
        System.out.println("String(StringBuffer): " + str5);
        
        /*
        String str6=strbuf.toString();  //嚙瞇StringBuffer嚙賞型String
        
        System.out.println("String: " + str6);
        */
    }
}
