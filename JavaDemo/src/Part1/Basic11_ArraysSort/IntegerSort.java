/*
    jdk提供Arrays.sort排序方法
    
    Arrays.sort(類別型態[]) 由小到大
　　Arrays.sort(類別型態[]), Collections.reverseOrder()) 由大到小
*/
package Part1.Basic11_ArraysSort;
import java.util.Arrays;
import java.util.Collections;

public class IntegerSort 
{
	public static void main(String[] args) 
	{
		System.out.println("Integer排序-\n");
    	//Integer[] arrayToSort = new Integer[] { 48, 5, 89, 80, 81, 23, 45, 16, 2 };
        Integer[] arrayToSort = { 48, 5, 89, 80, 81, 23, 45, 16, 2 };
    	System.out.print("排序前:");
        for(int element : arrayToSort) System.out.print(element + "\t");
        
        System.out.println("\n");
        
    	//Arrays.sort(arrayToSort); //由小到大
    	
        Arrays.sort(arrayToSort, Collections.reverseOrder()); //由大到小
    
    	System.out.print("排序後:");
        for(int element : arrayToSort) System.out.print(element + "\t");
        
        System.out.println("\n"); 
	} 
}