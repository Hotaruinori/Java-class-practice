package Part2.Unit26_Lambda.ArraysSort.Lab;
import java.util.Arrays;
import java.util.Collections;

public class Lab_StringSort_Lambda_Char2 
{
    public static void main(String[] args) 
    {
        String[] names = {"Oscar", "Charlie", "Ryan","Ted", "David" };
        
        //依第二個字元大小排序，使用Lambda語法
        //Insert code to here
        Arrays.sort(names, (x, y) -> ((String)x).charAt(1) - ((String)y).charAt(1));

        
        System.out.println("排序結果:");
        //Insert code to here
        System.out.println(Arrays.toString(names));
    }
}
