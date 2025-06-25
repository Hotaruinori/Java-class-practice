package Week02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex3 {
    public static void main(String[] args) {
    String text = "Egor Alla Anna";
    Pattern pattern = Pattern.compile("A.+?a");

    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
        int start=matcher.start();
        int end=matcher.end();
        System.out.println("Match found" + text.substring(start,end) + " с "+ start + " By " + (end-1) + "position");
    }
    System.out.println(matcher.replaceFirst("Ira"));
    System.out.println(matcher.replaceAll("Olga"));
    System.out.println(text);
}
}
