package Part1.Basic8_InputData;
import java.io.*;

public class InputString
{
	public static void main(String[] args) throws IOException
	{
		//讀取鍵盤輸入的數值
		BufferedReader keyin;
		String name="";
		keyin = new BufferedReader(
			        new InputStreamReader(System.in));
					
		System.out.print("請輸入姓名: ");
		name = keyin.readLine();
		  
		System.out.println( name + " 你好 !");	   
		System.out.println();

	}
}
