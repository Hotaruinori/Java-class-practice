package Part2.Unit26_Lambda.ArraysSort.Lab;
/*依字串第2個字元排序
  自訂Comparator物件*/

import java.util.Arrays;
import java.util.Comparator;

public class Lab_StringSort_Char2
{ 
  	public static void main(String[] args) 
  	{
  		System.out.println("String排序");
    	String[] arrayToSort = { "Oscar", "Charlie", "Ryan", "Ted", "David" };
    	
    	System.out.print("排序前:");
    	for (String element : arrayToSort) System.out.print(element + "\t");
    	
    	System.out.println("\n");
      
    	Arrays.sort(arrayToSort, new MyComparator());

    	System.out.print("排序後:");
    	for (String element : arrayToSort) System.out.print(element + "\t");

    	System.out.println("\n");  
  	} 
}

class MyComparator implements Comparator
{
  	public int compare(Object f, Object s) 
  	{
      	// Insert code to here
		return ((String) f).charAt(1) - ((String) s).charAt(1);

  	}
}
