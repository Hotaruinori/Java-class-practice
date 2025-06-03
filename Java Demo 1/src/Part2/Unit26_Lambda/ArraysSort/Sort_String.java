package Part2.Unit26_Lambda.ArraysSort;
/*依字串長度排序
  自訂Comparator物件*/

import java.util.Arrays;
import java.util.Comparator;

public class Sort_String 
{ 
  	public static void main(String[] args) 
  	{
  		System.out.println("String排序");
    	String[] names = { "Oscar", "Charlie", "Ryan", "Ted", "David" };
    	System.out.print("排序前:");
    	for(String element : names)
    	{
      		System.out.print(element + "\t");
    	}
    	System.out.println("\n");
      
    	Arrays.sort(names, new MyComparator());

    	System.out.print("排序後:");
    	for (String element : names) System.out.print(element + "\t");

   		System.out.println("\n");  
  	} 
}


class MyComparator implements Comparator
{
  public int compare(Object first, Object second) 
  {
    int len1 =  ((String)first).length();
    int len2 =  ((String)second).length();
 
    if(len1>len2)
        return -1;
    else if(len1==len2)
        return 0;
    else
        return 1;
          
  }
}
