package homework;
// 9. 潤年計算
// 年份能被 4 整除，但不能被 100 整除，或者
// 年份能被 400 整除。
import java.util.Scanner;
public class Ans_09 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入年份：");
        try {
            int input_year = scn.nextInt();

            if (input_year % 4 == 0 && input_year % 100 != 0 || input_year % 400 == 0) {
                System.out.println(input_year + "是潤年");
            } else {
                System.out.println(input_year + "不是潤年");
            }  
        }
        catch (Exception e) {
            System.out.println("錯誤：" + e);
        }
        scn.close();
    }
    
}
