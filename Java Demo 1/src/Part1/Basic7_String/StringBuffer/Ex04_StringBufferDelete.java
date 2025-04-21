package Part1.Basic7_String.StringBuffer;
public class Ex04_StringBufferDelete
{ 
    public static void main(String[] args) 
    {
        StringBuilder str = new StringBuilder("Java嚙緹嚙踝蕭嚙緙嚙踝蕭嚙請學範嚙踝蕭");
        System.out.println("嚙踝蕭l嚙緝嚙踝蕭   :  " + str);
        System.out.println();
        //嚙磋嚙踝蕭嚙緝嚙赭內嚙箴
        str.deleteCharAt(4);
        System.out.println("嚙磋嚙踝蕭嚙踝蕭嚙豬哨蕭4嚙踝蕭嚙緝嚙踝蕭      : " + str);
        System.out.println();
        str.delete(4,7);
        System.out.println("嚙磋嚙踝蕭嚙踝蕭嚙豬哨蕭4嚙踝蕭6嚙踝蕭嚙緝嚙踝蕭   : " + str);
        System.out.println();
        //嚙踝蕭嚙瞇嚙緝嚙赭內嚙箴
        str.setCharAt(5,'T');
        System.out.println("嚙踝蕭嚙瞇嚙踝蕭嚙豬哨蕭5嚙踝蕭嚙緝嚙踝蕭      : " + str);
        System.out.println();
        str.replace(4,8,"嚙緙嚙踝蕭嚙請學對蕭嚙�");  
        System.out.println("嚙踝蕭嚙瞇嚙踝蕭嚙豬哨蕭4嚙踝蕭7嚙踝蕭嚙緝嚙踝蕭   : " + str);
        System.out.println();
        str.setLength(0);
        System.out.println("嚙瞎嚙踝蕭嚙緝嚙赭內嚙箴   : " + str);
        
    }
}
