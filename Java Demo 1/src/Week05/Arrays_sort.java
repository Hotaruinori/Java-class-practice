package Week05;
// \\@FunctionalInterface
// \\public interface Comparator<T>{
// \\int compare(T o1, T o2);
// \\}
import java.util.Arrays;
import java.util.Comparator;

public class Arrays_sort {
public static void main(String[] args) {

    Integer[] numbers = {5, 3, 8, 1, 2};

    // 自定義排序規則：從大到小
    Arrays.sort(numbers, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            //return o2 - o1; // 大的在前
            return o1 - o2; // 小的在前
        }
    });

    // 打印排序後的數組
    System.out.println(Arrays.toString(numbers));


        // 使用 Lambda 表達式自定義排序規則
    Arrays.sort(numbers, (o1, o2) -> o2 - o1);

    System.out.println(Arrays.toString(numbers));   
}





}
