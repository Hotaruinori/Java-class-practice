package Part1.Basic8_InputData;
import java.util.*;

public class InputNum
{
	public static void main(String[] args)
	{
       Scanner keyin = new Scanner(System.in);
       
       System.out.print("請輸入整數: ");
       String str1 = keyin.nextLine();
       
       /*資料合理檢查*/
       
	   int iNum = Integer.parseInt(str1);
       System.out.println("將輸入的整數 * 5 = " + iNum*5);	   
	   System.out.println();
	   
	   System.out.print("請輸入浮點數: ");
       String str2 = keyin.nextLine();

       /*資料合理檢查*/
       
       double fNum = Double.parseDouble(str2);
       System.out.println("將輸入的浮點數 * 5 = " + fNum*5);
       keyin.close();
	}
}
