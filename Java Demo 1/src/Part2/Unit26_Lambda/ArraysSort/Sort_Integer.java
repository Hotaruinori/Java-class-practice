
//Arrays.sort，以及Comparator介面的用法
/*
    jdk提供Arrays.sort排序方法
    
    Arrays.sort(類別型陣列) 由小到大
　　Arrays.sort(類別型陣列, Comparator物件)
    Collections.reverseOrder() Comparator物件由大到小
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class Sort_Integer 
{
	public static void main(String[] args) 
	{
		System.out.println("Integer排序");
    	Integer[] arrayToSort = new Integer[] { 48, 5, 89, 80, 81, 23, 45, 16, 2 };
    
    	System.out.print("排序前:");
    	for(int i = 0; i < arrayToSort.length; i++)
    	{
      		System.out.print(arrayToSort[i] + "\t");
    	}  
    	System.out.println("\n");
    	
    	Arrays.sort(arrayToSort); //由小到大
    	    
    	System.out.print("排序後:");
        for(int element : arrayToSort) System.out.print(element + "\t");
    	System.out.println("\n"); 
	} 
}
 