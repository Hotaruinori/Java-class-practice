//���յ{�����~��m�����
import java.util.Arrays;

public class ShowErrorLine 
{	
    public void showArray(String title, int[] ary) 
    {
        System.out.print(title);
        //for( int element : ary ) System.out.print(element + "\t");
        for(int x=0; x<=ary.length; x++) System.out.print(ary[x] + "\t");
        System.out.println("\n");
    } 
    
    public int[] mySort(int[] ary)
    {
        Arrays.sort( ary );
        System.out.println();
        return ary;
    }
          
	public static void main(String[] args) 
	{
        int[] num = { 48, 5, 89, 80, 81, 23, 45, 16, 2 };
        ShowErrorLine tools=new ShowErrorLine();
        tools.showArray("�Ƨǫe:",num);
    	       	
    	num=tools.mySort(num);
        
        tools.showArray("�Ƨǫ�:",num);
        System.out.println("\n"); 
	} 
}