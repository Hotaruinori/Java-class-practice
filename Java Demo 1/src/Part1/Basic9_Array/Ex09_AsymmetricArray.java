
public class Ex09_AsymmetricArray
{
	public static void main(String[] args)
	{
		int[][] ary = new int[3][];
		ary[0] = new int[3];
		ary[1] = new int[2];
		ary[2] = new int[5];
				
        System.out.println("以Enhance for輸出陣列所有元素:");
        for(int[] row : ary)
        {
            for(int element : row)
                System.out.print(element + "  ");
                
            System.out.println();
        }                         
    }   
}