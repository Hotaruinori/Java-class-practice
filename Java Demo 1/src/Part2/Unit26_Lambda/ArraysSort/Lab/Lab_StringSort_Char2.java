/*�̦r���2�Ӧr���Ƨ�
  �ۭqComparator����*/

import java.util.Arrays;
import java.util.Comparator;

public class Lab_StringSort_Char2
{ 
  	public static void main(String[] args) 
  	{
  		System.out.println("String�Ƨ�");
    	String[] arrayToSort = { "Oscar", "Charlie", "Ryan", "Ted", "David" };
    	
    	System.out.print("�Ƨǫe:");
    	for (String element : arrayToSort) System.out.print(element + "\t");
    	
    	System.out.println("\n");
      
    	Arrays.sort(arrayToSort, new MyComparator());

    	System.out.print("�Ƨǫ�:");
    	for (String element : arrayToSort) System.out.print(element + "\t");

    	System.out.println("\n");  
  	} 
}

class MyComparator implements Comparator
{
  	public int compare(Object f, Object s) 
  	{
      	// Insert code to here

  	}
}
