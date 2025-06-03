package Part2.Unit26_Lambda.ArraysSort.Lab;
//Lab: Sorted

import java.util.Arrays;
import java.util.Collections;

public class Lab_LambdaSort 
{
    public static void main(String[] args) 
    {
    	String[] names = { "Amanda", "Grace", "Blanche", "Helen", "Juliet", "Linda", "Diana" };
        
        //依第3個字元大小排序, 字元相同時依長度(使用Lambda語法)
        //Insert code
        Arrays.sort(names, (x, y) -> ((String)x).charAt(2) - ((String)y).charAt(2) == 0 ? 
            ((String)x).length() - ((String)y).length() : ((String)x).charAt(2) - ((String)y).charAt(2));


        
        System.out.println("排序結果:");
        //Insert code
        System.out.println(Arrays.toString(names));
		
    }
}
