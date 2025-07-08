package Part1.Basic9_Array;
public class Ex05_Print
{
	public static void main(String[] args)
	{
        int[] ary = {10, 12, 14, 16, 18, 20};

        System.out.println("輸出方式一");
        for( int x=0; x<6; x++ )
        {
            System.out.print(ary[x] + "  ");
        }
        System.out.println('\n');

        System.out.println("輸出方式二");
        for( int x=0; x<ary.length; x++ )
        {
            System.out.print(ary[x] + "  ");
        }
        System.out.println('\n');
        
        System.out.println("輸出方式三");
        for( int element : ary )
        {
            System.out.print(element + "  ");
        }    
        System.out.println();
    }
}