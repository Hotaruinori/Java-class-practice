//四捨五入到小數第2位 使用 Math.floor()
package Part1.Basic3.Lab;
import java.util.*;

public class Lab_Round2
{
	public static void main(String[] args) 
	{
       Scanner keyin = new Scanner(System.in);
			         
	   System.out.print("請輸入數值: ");
       String sNum = keyin.nextLine();
	   double iNum = Double.parseDouble(sNum);
	   
       //Insert code to here
             
       System.out.println("結果 = " +  round(iNum));
	   keyin.close();
    }


    public static double round(double num)
    {
        if (num >= 0){
        return Math.floor(num*100 +0.5)/100;
    }
        else{
        return Math.floor(num*100 -0.5)/100;
    }
}
}
