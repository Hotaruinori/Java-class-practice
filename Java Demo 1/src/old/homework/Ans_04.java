// 4.使用scanner接收鍵盤輸入1字串, 由螢幕目輸出
// 4.使用scanner接收鍵盤輸入1字串, 若輸入字串為 exit 則跳出程式結束
// 4.使用scanner接收鍵盤輸入1字串, 若輸入字串為 A 則輸出10, 若輸入字串為 B 則輸出20, 若輸入字串為 exit 則跳出程式結束
// 4.使用迴圈for 印出 1到10的數字
package homework;
import java.util.Scanner;
public class Ans_04 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        while (true) {
            System.out.println("請輸入字串(輸入exit退出)：");
            try {
                
                String input = scn.nextLine();
                if (input.equals("exit")){
                    break;
                }
                else if(input.equals("A")){
                    System.out.println(10);
                }
                else if(input.equals("B")){
                    System.out.println(20);
                }
                else{
                    System.out.println("你輸入的字串為：" + input);
                    
                }    
            } catch (Exception e) {
                System.out.println("發生錯誤" + e);
            }
        }
        scn.close();
        System.out.println("輸入結束");

    }




}
