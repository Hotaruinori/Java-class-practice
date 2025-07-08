package Part1.Basic11_ArraysSort;
import java.util.*;

public class IntSort2
{
    public static void myPrint(String msg, int[] array)
    {
        System.out.print(msg);
        for(int element : array) System.out.print(element + "\t");
        System.out.println("\n");        
    }   


    public static void main(String[] args) 
    {
        System.out.println("int�Ƨ�-\n");
        int[] intarray = {15, 8, 25, 48, 2, 10, 33, 20};
        
        myPrint("�Ƨǫe:", intarray);
        
        Arrays.sort(intarray,2,7);
        
        myPrint("�Ƨǫ�:", intarray);
    }
}