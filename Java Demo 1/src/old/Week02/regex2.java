package Week02;

import java.util.regex.Pattern;

public class regex2 {
    public static void main(String[] args) {
    String text = "Egor Alla Anna";
    Pattern pattern = Pattern.compile("\\s");
    String[] strings = pattern.split(text,2);
    for (String s : strings) {
        System.out.println(s);
    }
    System.out.println("---------");
    String[] strings1 = pattern.split(text);
    for (String s : strings1) {
        System.out.println(s);
    }
}
    
}
