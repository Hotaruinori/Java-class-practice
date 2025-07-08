package Part1.Basic11_ArraysSort;
import java.util.Arrays;
import java.util.Collections;

public class StringSort 
{ 
    public static void main(String[] args) 
    {
  	    System.out.println("String�Ƨ�-\n");
        String[] arrayToSort = { "Oscar", "Charlie", "Ryan", "Ted", "David" };
    
        System.out.print("�Ƨǫe:");
        for (String element : arrayToSort) System.out.print(element + "\t");

        System.out.println("\n");
      
        //Arrays.sort(arrayToSort);
        Arrays.sort(arrayToSort,Collections.reverseOrder());

        System.out.print("�Ƨǫ�:");
        for (String element : arrayToSort)
        {
            System.out.print(element + "\t");
        }
        System.out.println("\n");  
    } 
}
