package homework;
// 10.亂數
import java.util.Random;
public class Ans_10 {
    public static void main(String[] args) {    
        Random r = new Random();
        int randomNumber = r.nextInt(9999) + 1; // 0~10000
        System.out.println("產生的亂數是：" + randomNumber);


        Random c = new Random();
        // 只產生可列印的ASCII字符 (32~126)
        char word = (char)(c.nextInt(126 - 32 + 1) + 32);
        System.out.println("產生的亂數字符是：" + word);
    }
}
