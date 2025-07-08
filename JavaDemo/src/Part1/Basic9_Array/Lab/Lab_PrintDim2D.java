package Part1.Basic9_Array.Lab;
public class Lab_PrintDim2D
{
	public static void main(String[] args)
	{
		int[][] ary = {{2,4,6,8},{1,3,5,7},{10,11,12,13}};
				
        System.out.println("輸出所有元素:");
        
        int x,y;
        
        //使用length屬性
        for (x=0; x<ary.length; x++)
        {
            for (y=0; y<ary[x].length; y++){
                // System.out.print(ary[x][y] + "\t");
                System.out.print(String.format("%-4s", ary[x][y]));
            }
            System.out.println();
        }

            
               
    }   
}