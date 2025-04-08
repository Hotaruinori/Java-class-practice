package Part1.Basic7_String.StringBuffer;
public class Ex03_StringBufferInsert
{ 
    public static void main(String[] args) 
    {
        StringBuilder str = new StringBuilder("Java嚙緹嚙踝蕭嚙緙嚙踝蕭嚙請學範嚙踝蕭");
        boolean boo = true;
        char[] chary = { 'W', 'X', 'Y', 'Z' };
        System.out.println("嚙踝蕭l嚙緝嚙踝蕭 : " + str);
        System.out.println();
        //嚙踝蕭嚙皚嚙緝嚙赭內嚙箴
        str.insert(2, boo);                      //嚙踝蕭嚙盤 
        System.out.println("嚙踝蕭嚙盤嚙褓湛蕭嚙皚嚙踝蕭嚙豬哨蕭2   : " + str);
        str.insert(0, 'C');                       //嚙緝嚙踝蕭 
        System.out.println("嚙緝嚙踝蕭嚙踝蕭嚙皚嚙踝蕭嚙豬哨蕭0     : " + str);
        str.insert(2, chary);
        System.out.println("嚙緝嚙踝蕭嚙罷嚙瘠嚙踝蕭嚙皚嚙踝蕭嚙豬哨蕭2 : " + str);
        str.insert(6, chary, 1, 3);           //嚙緝嚙踝蕭嚙罷嚙瘠 
        System.out.println("嚙緝嚙踝蕭嚙罷嚙瘠嚙踝蕭嚙踝蕭嚙踝蕭嚙踝蕭嚙踝蕭嚙皚嚙踝蕭嚙豬哨蕭6 : " + str);
        str.insert(11, 247);                       //嚙踝蕭嚙?
        System.out.println("嚙踝蕭?湛蕭嚙皚嚙踝蕭嚙豬哨蕭11    : " + str);
        str.insert(15, 234.56);                    //嚙畿嚙瘢嚙踝蕭
        System.out.println("嚙畿嚙瘢嚙複湛蕭嚙皚嚙踝蕭嚙豬哨蕭15  : " + str);
        str.insert(5, "嚙請橘蕭嚙踝蕭嚙緬");
        System.out.println("嚙緝嚙赭插嚙皚嚙踝蕭嚙豬哨蕭5     : " + str);
        
    }
}
