package Part1.Basic7_String.String;
import java.util.*;

public class Ex05_StringSubstring
{ 
    public static void main(String[] args) 
    {
        String str1="Java language";
        String str2= new String("嚙緹嚙踝蕭嚙稽嚙緘嚙請學範嚙踝蕭");
         
        System.out.println("嚙踝蕭嚙調迎蕭嚙稷嚙踝蕭r嚙踝蕭: \"" + str1 + "\"");
        System.out.println("嚙踝蕭嚙調迎蕭嚙踝蕭嚙踝蕭r嚙踝蕭: \"" + str2 + "\"");
        System.out.println();
        //嚙締嚙緝嚙踝蕭M嚙緝嚙踝蕭嚙踝蕭嚙畿嚙緲
        System.out.println("嚙稷嚙踝蕭r嚙踝蕭charAt(3): " + str1.charAt(3));
        System.out.println("嚙踝蕭嚙踝蕭r嚙踝蕭charAt(3): " + str2.charAt(3));
        System.out.println("嚙稷嚙踝蕭r嚙踝蕭substring(2): " + str1.substring(2));
        System.out.println("嚙踝蕭嚙踝蕭r嚙踝蕭substring(2, 6): "+str2.substring(2, 6));
        System.out.println("嚙踝蕭嚙瞇嚙稷嚙踝蕭r嚙踝蕭replace('a', 'b'): " + str1.replace('a','b'));
        System.out.println("嚙踝蕭嚙瞇嚙稷嚙踝蕭l嚙緝嚙踝蕭replace(\"a\", \"b\"): " + str1.replace("a","b"));  
        System.out.println("嚙踝蕭嚙瞇嚙稷嚙踝蕭l嚙緝嚙踝蕭replace(\"a\", \"bc\"): " + str1.replace("a","bc"));  
                
        //嚙踝蕭嚙碼嚙踝蕭r嚙踝蕭
        String str3 = str1.concat(str2);
        System.out.println("嚙踝蕭嚙碼嚙稷嚙踝蕭r嚙踝蕭P嚙踝蕭嚙踝蕭r嚙踝蕭: " + str3);
         
        String str4 = str1+str2;
        System.out.println("嚙踝蕭嚙碼嚙稷嚙踝蕭r嚙踝蕭P嚙踝蕭嚙踝蕭r嚙踝蕭: " + str4);
        System.out.println();
         
        String[] music= {"嚙緯嚙線嚙踝蕭嚙踝蕭","嚙緙嚙賣音嚙踝蕭","嚙踝蕭h嚙踝蕭嚙踝蕭","嚙篌嚙賢音嚙踝蕭","嚙練嚙踝蕭嚙踝蕭嚙踝蕭"};
        String str5=String.join("-",music);  //嚙踝蕭嚙瞌嚙踝蕭k
        System.out.println(str5);
         
        List<String> list= new ArrayList<>();
        list.add("嚙緯嚙線嚙踝蕭嚙踝蕭");
        list.add("嚙緙嚙賣音嚙踝蕭");
        list.add("嚙踝蕭h嚙踝蕭嚙踝蕭");
        list.add("嚙篌嚙賢音嚙踝蕭");
        list.add("嚙練嚙踝蕭嚙踝蕭嚙踝蕭");
        String str6=String.join("+++",list);  //嚙踝蕭嚙瞌嚙踝蕭k
        System.out.println(str6);
        
    }
}