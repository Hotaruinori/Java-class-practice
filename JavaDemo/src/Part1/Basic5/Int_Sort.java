/*
    jdk提供Arrays.sort排序方法
    Arrays.sort(基本資料型態[]) 由小到大
    Arrays.sort(基本資料型態[],index1,index2)
*/
package Part1.Basic5;
import java.util.Arrays;

public class Int_Sort 
{
	public static void main(String[] args) 
	{
		System.out.println("int排序");
    	int[] num = { 48, 5, 89, 80, 81, 23, 45, 16, 2 };
    
    	System.out.print("排序前:");
        for( int element : num ) System.out.print(element + "\t");
    	System.out.println("\n");
    	
    	Arrays.sort( num );  //由小到大
        //Arrays.sort( num,2 ,7 ); //由小到大
        
    	System.out.print("排序後:");
        for( int element : num ) System.out.print(element + "\t");
        System.out.println("\n"); 
	} 
}
