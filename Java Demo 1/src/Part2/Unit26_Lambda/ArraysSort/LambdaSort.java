package Part2.Unit26_Lambda.ArraysSort;
import java.util.Arrays;
import java.util.Collections;

public class LambdaSort 
{
    public static void main(String[] args) 
    {
        String[] names = {"Oscar", "Charlie", "Ryan","Ted", "David" };       
        
        //依長度排序
        Arrays.sort(names, (name1, name2) -> name1.length() - name2.length()); 
        
        //System.out.println(Arrays.toString(names));
        for(String element : names) System.out.print(element + "\t");

    	System.out.println("\n");  

    }
}
 