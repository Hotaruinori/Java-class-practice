package Part1.Basic9_Array;
public class Ex08_2Dimension
{
	public static void main(String[] args)
	{
	    // int[][] ary1;
	    
	    // int ary2[][];
	    
	    // int[] ary3[];  //少見的寫法
	    
	    // int[][] ary4=new int[3][4]; 
	    
		int[][] ary5 = {{2,4,6,8},{1,3,5,7},{10,11,12,13}};
        
		for(int i=0; i<ary5.length; i++)
		{
		    for(int j=0; j<ary5[i].length; j++)
		    {
		        System.out.print(ary5[i][j] + "\t");
		    }
		    System.out.println();
		}
    }   
}