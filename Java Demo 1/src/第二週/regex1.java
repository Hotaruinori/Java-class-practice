package 第二週;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex1{
    public static void main(String[] args) {
        String text = "Egor Alla Alexander";
        // 比較A.+ 與 A.++ 與 A.+? 的差異
        // A.+ 會匹配最長的字串
        // A.++ 會匹配最長的字串(當您將文字抓取到行尾時，不會向後搜尋，在這範例會找不到)
        // A.+? 會匹配最短的字串
        
        Pattern pattern = Pattern.compile("A.+a");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
           


        Pattern x = Pattern.compile("A.+a");
        Matcher y = x.matcher(text);
       
        if (y.find()) {
            System.out.println(text.substring(y.start(), y.end()));
        }
        else {
            System.out.println("No match found");
        }
   
        System.out.println(y.find());

        
    }
}
