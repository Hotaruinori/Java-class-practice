package Week01;
import java.util.Arrays;

public class ArrayExample2 {

    public static void main(String[] args) {

        int[] iArray = {1, 2, 3, 4, 5, 9, 7}; // 陣列初始化
        System.out.println("陣列內容: " + Arrays.toString(iArray)); // 輸出陣列內容

        int max = iArray[0]; // 假設第一個是最大值

        for (int i = 0; i < iArray.length; i++) {
            // 從 iArray 中尋找最大值
            if (iArray[i] > max) {
                max = iArray[i];
            }
        }

        System.out.println("最大值是: " + max); // 輸出最大值
    }
}