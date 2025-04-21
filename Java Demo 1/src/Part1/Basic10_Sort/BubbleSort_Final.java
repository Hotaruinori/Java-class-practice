
public class BubbleSort_Final
{
    public static void main(String[] args) 
    {
        int x, y;
        boolean ok;   //true:排序完成, false:排序未完成
        
        int[] ary = {15, 8, 25, 48, 2, 10};
        //int[] ary = {2, 8, 10, 15, 25, 48};
        //int[] ary = {8, 2, 10, 25, 15, 48};
        
        System.out.println("原始陣列:");
           
        for(int num : ary) System.out.print(num + "  ");
           
        System.out.println("\n\n");
        
        
        for( x = 1; x <= ary.length-1; x++ ) 
        {
           ok=true;        
           for( y = 0; y <= ary.length-1-x; y++ ) 
           {
              if (ary[y] > ary[y+1])  // swap 前後元素的內容
              {
                 int tmp;
                 tmp = ary[y];
                 ary[y] = ary[y+1];
                 ary[y+1] = tmp;
                 ok=false;     //
              }   
           }
           
           System.out.println("第"+(x)+"輪的結果:");
           
           for(int num : ary) System.out.print(num + "  ");
           
           System.out.print("------> " + (y) + " 次");   
           System.out.println();
           
           if(ok) break;               
        }
        
        System.out.println("\n\n\n排序後的結果:");
        
        for(int num : ary) System.out.print(num + "  ");
        
        System.out.println();
    }
}
