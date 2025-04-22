/*
    jdk提供Arrays.sort排序方法
    
　　Arrays.sort(基本資料型態[]) 由小到大
    Arrays.sort(基本資料型態[],index1,index2)
*/
package Part1.Basic11_ArraysSort;
import java.util.Arrays;

public class IntSort 
{
    public static void myPrint(String msg, int[] array)
    {
        System.out.print(msg);
        for(int element : array) System.out.print(element + "\t");
        System.out.println("\n");        
    }   
     
     
	public static void main(String[] args) 
	{
		System.out.println("int排序-\n");
        int[] intarray = { 48, 5, 89, 80, 81, 23, 45, 16, 2 };
    
        myPrint("排序前:", intarray);
    	
        Arrays.sort(intarray); //由小到大
    	
        myPrint("排序後:", intarray);
	} 
}