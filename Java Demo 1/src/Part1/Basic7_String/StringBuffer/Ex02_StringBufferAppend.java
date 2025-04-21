package Part1.Basic7_String.StringBuffer;
public class Ex02_StringBufferAppend
{ 
    public static void main(String[] args) 
    {
        StringBuilder str = new StringBuilder("Java嚙緹嚙踝蕭嚙緙嚙踝蕭嚙請學範嚙踝蕭"); 
        boolean boo = true;
        char[] chary = { 'V', 'W', 'X', 'Y', 'Z' };
        // byte[] byary = { 65, 66, 67, 68, 69, 70 };
        System.out.println("嚙踝蕭l嚙緝嚙踝蕭 : " + str);
        System.out.println();
            System.out.println(str.length() + "/" + str.capacity());       
        //嚙編嚙磕嚙緝嚙赭內嚙箴
        str.append(boo);  //嚙踝蕭嚙盤嚙踝蕭
        System.out.println("嚙編嚙磕嚙踝蕭嚙盤嚙踝蕭   : " + str);
        str.append(chary);  //嚙緝嚙踝蕭嚙罷嚙瘠
        System.out.println("嚙編嚙磕嚙緝嚙踝蕭嚙罷嚙瘠 : " + str);
        str.append(chary, 2, 3);  //嚙緝嚙踝蕭嚙罷嚙瘠
        System.out.println("嚙編嚙磕嚙緝嚙踝蕭嚙罷嚙瘠 : " + str);
            System.out.println(str.length() + "/" + str.capacity());
/*        
        System.out.println();
        str.append(byary);
        System.out.println("嚙編嚙磕byte嚙罷嚙瘠 : " + str);
        System.out.println();
*/        
        str.append(247);     //嚙踝蕭嚙�
        System.out.println("嚙編嚙磕嚙踝蕭嚙�     : " + str);
        str.append(234.56);  //嚙畿嚙瘢嚙踝蕭
        System.out.println("嚙編嚙磕嚙畿嚙瘢嚙踝蕭   : " + str);
            System.out.println(str.length() + "/" + str.capacity());        
        str.append("嚙請橘蕭嚙踝蕭嚙緬");
        System.out.println("嚙編嚙磕嚙緝嚙踝蕭     : " + str);
        str.reverse();  //嚙踝蕭嚙踝蕭
        System.out.println("嚙踝蕭嚙踝蕭r嚙踝蕭     : " + str);
            System.out.println(str.length() + "/" + str.capacity());
            
    }
}