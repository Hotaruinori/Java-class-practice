/*
    jdk提供Arrays.sort排序方法    
    Arrays.sort(類別型態[]) 由小到大
　　Arrays.sort(類別型態[], Collections.reverseOrder()) 由大到小
*/
package Part1.Basic5;
import java.util.Arrays;
// import java.util.Collections;

public class String_Sort 
{ 
    public static void main(String[] args) 
    {
        System.out.println("String排序");
        String[] name = { "Lily", "Lulu", "Jojo", "Anna", "Diana", "Nana" };
    
        System.out.print("排序前:");
        for (String element : name) System.out.print(element + "\t");

        System.out.println("\n");
      
        Arrays.sort(name);
        //Arrays.sort(name, Collections.reverseOrder());

        System.out.print("排序後:");
        for (String element : name) System.out.print(element + "\t");

        System.out.println("\n");  
    } 
}
