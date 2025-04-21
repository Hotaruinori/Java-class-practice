package Part1.Basic9_Array;
public class Ex10_2DimPrint
{
	public static void main(String[] args)
	{
		int[][] ary = {{2,4,6,8},{1,3,5,7},{10,11,12,13}};
        //int[] ary[] = {{2,4,6,8},{1,3,5,7},{10,11,12,13}};
        				
        System.out.println("輸出所有元素:");
        
        int x,y;
        
        for( x=0; x<3; x++ )
        {
            for( y=0; y<4; y++ )
                System.out.print("\t" + ary[x][y]);
                
            System.out.println();
        }
        System.out.println("\n");
        
        // or
        
        for(int[] row : ary)
        {
            for(int element : row)
                System.out.print("\t" + element);
                
            System.out.println();
        }          
    }   
}