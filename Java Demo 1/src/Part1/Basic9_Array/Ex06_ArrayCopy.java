
import java.util.*;

public class Ex06_ArrayCopy
{
	public static void main(String[] args)
	{
		
	   int[] ary = {2, 4, 6, 8, 10, 12, 14, 16};
	   	
	   System.out.println("�쥻���}�C�G");
	   for(int value : ary)
	   {
		  System.out.print(value + "  ");
	   }	  
		  
       System.out.println("\n");
          
       int[] temp;                                        //�ŧi�s�}�Ctemp
       
 	   temp = ary;                                        //temp���Vary�O����
	   ary = new int[ary.length + 2];                     //���s�t�mary
	   
	   System.arraycopy(temp, 0, ary, 0, temp.length);    //�ƻs�}�C
	   
	   ary[8] = 180;
	   ary[9] = 200;	                                  //�s�W�������
       temp=null;
       
	   System.out.println("���[�᪺�s�}�C�G");
	   for(int value : ary)
	   {
		  System.out.print(value + "  ");
	   }	  
		  
	   System.out.println("\n");
/*	   
       ArrayList ary2=new ArrayList(8);
       
       ary2.add(new Integer(2));
       ary2.add(4);
       ary2.add(6);
       ary2.add(8);
       ary2.add(10);
       ary2.add(12);
       ary2.add(14);
       ary2.add(16);
       ary2.add(18);
       ary2.add(20);
       
       System.out.println(ary2);
       for(Object o : ary2) System.out.print(o + "  ");
       
       System.out.println();
*/       
    }
}