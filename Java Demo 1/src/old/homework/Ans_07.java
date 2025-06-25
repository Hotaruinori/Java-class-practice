package homework;
// 7.使用迴圈計算1+2+3加到100的總合
public class Ans_07 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1~100總合為：" + sum);
    }
    
}
