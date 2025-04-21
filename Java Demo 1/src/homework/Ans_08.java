package homework;
// 8.使回遞迴Recursion計算1加到100的總合 N!=N+(N-1)!
public class Ans_08 {
    public static void main(String[] args) {
        int sum = sumRec(100);
        System.out.println("1到100的總合為：" + sum);
    }

    public static int sumRec(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }
}
