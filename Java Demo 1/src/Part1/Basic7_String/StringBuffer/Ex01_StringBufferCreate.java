package Part1.Basic7_String.StringBuffer;
public class Ex01_StringBufferCreate
{ 
    public static void main(String[] args) 
    {
        String str = "Java程式設計教學範例";
        StringBuffer str1 = new StringBuffer();   //空字串
        StringBuffer str2 = new StringBuffer(20); //設定字串容量
        StringBuffer str3 = new StringBuffer(str);
        StringBuffer str4 = new StringBuffer("Java程式語言"); 
        
        // 顯示字串內容
        System.out.println("str1:" + str1);
        System.out.println("str2:" + str2);
        System.out.println("str3:" + str3);
        System.out.println("str4:" + str4);
        System.out.println();
        
        System.out.println("str1長度/容量: " + str1.length() + "/" + str1.capacity());
        System.out.println("str2長度/容量: " + str2.length() + "/" + str2.capacity());
        System.out.println("str3長度/容量: " + str3.length() + "/" + str3.capacity());
        System.out.println("str4長度/容量: " + str4.length() + "/" + str4.capacity());
        
    }
}