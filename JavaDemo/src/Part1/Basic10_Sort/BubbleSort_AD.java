package Part1.Basic10_Sort;

public class BubbleSort_AD
{
    public static void main(String[] args) 
    {
        int x, y;
        int[] ary = {15, 8, 25, 48, 2, 10,1, 3};
        //int[] ary = {2, 8, 10, 15, 25, 48};
        //int[] ary = {8, 2, 10, 25, 15, 48};
        
        System.out.println("原始陣列:");
           
        for(int num : ary) System.out.print(num + "  ");
           
        System.out.println("\n\n");
        
        
        for( x = 1; x <= ary.length-1; x++ )  
        {        
           for( y = 0; y < ary.length-1; y++ ) 
           {
              if (ary[y] > ary[y+1])  // swap 前後元素的內容
              {
                 int tmp;
                 tmp = ary[y];
                 ary[y] = ary[y+1];
                 ary[y+1] = tmp;
              }   
           }
           
           System.out.println("第"+(x)+"輪的結果:");
           
           for(int num : ary) System.out.print(num + "  ");
           
           System.out.print("------> " + (y) + " 次");   
           System.out.println();
        }
        
        System.out.println("\n\n\n排序後的結果:");
        
        for(int num : ary) System.out.print(num + "  ");
        
        System.out.println();
    }
}
