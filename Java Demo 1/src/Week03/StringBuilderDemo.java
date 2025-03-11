package Week03;
import java.lang.StringBuilder;

public class StringBuilderDemo{
    public static void main(String[] args) {
        
        String str1 = "Hello";
        str1 = str1 + " World";
        System.out.println(str1);
        //字串相連用
        str1 = str1.concat(" Today!!");
        System.out.println(str1);

        for (int i = 0; i < 10; i++) {
            str1 = str1.concat(" "+i);
        }
        System.out.println(str1);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", World!");
        System.out.println("字串1: " + sb);
        String str3 = sb.toString();
        System.out.println("字串2: " + str3);

        for(int i = 0; i < 10; i++){

            sb.append(" " + i);
            
        }
        System.out.println("字串3: " + sb);
        /*
        时间复杂度：
        对于多次拼接操作，String的concat方法的时间复杂度是O(n²)，因为每次操作都需要复制之前的字符串。
        StringBuilder的append方法的时间复杂度接近O(n)，因为它只需要在现有数组上进行扩展和修改。
         */


    }




}