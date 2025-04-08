package Part1.Basic7_String.Parameters;
class Transfer
{
	float f;	
	float getC(float c)	
	{
		f = ((9 * c) / 5) + 32;	//攝氏轉成華氏	
		return f;	
	}
}


public class Commandline
{
	public static void main(String[] args)
	{
		float c = Float.parseFloat(args[0]); //讀入參數
		
		Transfer transfer = new Transfer();
		System.out.println(c + "°C = " + transfer.getC(c) + "°F");	
	}
}