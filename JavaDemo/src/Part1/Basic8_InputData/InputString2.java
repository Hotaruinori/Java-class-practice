//Java 5 加入
package Part1.Basic8_InputData;
import java.util.*;

public class InputString2
{
    public static void main(String[] args)
	{
        String name, addr;				
		Scanner keyin = new Scanner(System.in);
        
		System.out.print("姓名: ");
		name = keyin.nextLine();
			
		System.out.println();	
		System.out.println("你輸入的姓名是: " + name + '\n');

        System.out.print("地址: ");
        addr = keyin.nextLine();  
          
        System.out.println();   
        System.out.println("你輸入的地址是: " + addr);
		keyin.close();
	}
	
}
