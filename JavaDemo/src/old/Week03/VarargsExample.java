package Week03;
public class VarargsExample {
    public static void main(String[] args) {
        int sum1 = sum(1, 2, 3);
        int sum2 = sum(10, 20);
        int sum3 = sum(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096);

        System.out.println("Sum1: " + sum1); // 6
        System.out.println("Sum2: " + sum2); // 30
        System.out.println("Sum3: " + sum3); // 0
    }
    // int... 要放在最後
    public static int sum(int i, int... numbers) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return i + sum;
        }
}
