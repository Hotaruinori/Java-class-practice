package Part1.Basic8_InputData;
public class InputChar
{
	public static void main(String[] args) throws java.io.IOException
	{
       //讀取鍵盤輸入的字元
       char cin;
	   System.out.print("輸入任意字元1: ");
	   cin = (char)System.in.read();
       System.in.read();                //讀取return字元
       System.in.read();                //讀取換列字元
       System.out.println("輸入的字元是: " + cin);
	   System.out.println();
	   
       System.out.print("輸入任意字元2: ");
       cin = (char)System.in.read(); 
       //System.in.read();                //讀取return字元
       //System.in.read();                //讀取換列字元
       System.out.println("輸入的字元是: " + cin);
       System.out.println();
       
       System.out.print("輸入任意字元3: ");
       cin = (char)System.in.read();
       //System.in.read();                //讀取return字元
       //System.in.read();                //讀取換列字元
       System.out.println("輸入的字元是: " + cin);
       System.out.println();
       
       System.out.print("輸入任意字元4: ");
       cin = (char)System.in.read();
       //System.in.read();                //讀取return字元
       //System.in.read();                //讀取換列字元
       System.out.println("輸入的字元是: " + cin);
	}
}

 
 
 
 
       //System.in.read();                //讀取return字元
       //System.in.read();                //讀取換列字元
