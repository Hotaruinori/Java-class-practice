/*
    jdk提供Arrays.sort排序方法    
    Arrays.sort(類別型態[]) 由小到大
　　Arrays.sort(類別型態[], Collections.reverseOrder()) 由大到小
*/
package Part1.Basic5;
import java.util.*;

public class Integer_Sort
{
    public static void main(String[] args) 
    {
        Integer[] num = {15, 8, 25, 48, 2, 10, 33, 20};
        System.out.println("由大到小排序:");
        System.out.println("排序前:");
        
        for( int n=0; n<num.length; n++ ) System.out.print(num[n] + "\t");
        
        System.out.println();
        
        Arrays.sort( num, Collections.reverseOrder());
        
        System.out.println("\n\n排序後的結果:");
        
        for(int element : num ) System.out.print(element + "\t");

        System.out.println();
    }
}
