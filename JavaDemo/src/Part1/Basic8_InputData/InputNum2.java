package Part1.Basic8_InputData;
import java.util.*;

public class InputNum2
{
    public static void main(String[] args)
    {
       Scanner keyin = new Scanner(System.in);
       System.out.print("請輸入整數: ");
       int iNum = keyin.nextInt();
       System.out.println("將輸入的整數 X 5 = " + iNum*5);
       
       System.out.println();
       
       System.out.print("請輸入浮點數: ");
       float fNum = keyin.nextFloat();
       System.out.println("將輸入的浮點數 X 5 = " + fNum*5);
       keyin.close();
    }
}