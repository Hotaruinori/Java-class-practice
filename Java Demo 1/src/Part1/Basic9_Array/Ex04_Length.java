package Part1.Basic9_Array;
public class Ex04_Length
{
	public static void main(String[] args)
	{
	
        int[] ary = {10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};
        
        System.out.println("陣列大小:" + ary.length);
        System.out.println();
        
        System.out.println("以屬性length輸出");
        for (int x = 0; x < ary.length; x++)
        {
            System.out.print(ary[x] + "  ");
        }
        System.out.println();
    }
}