//Java 6 加入
package Part1.Basic8_InputData;
import java.io.*;

public class InputData
{
   public static void main(String[] args) throws IOException
   {
      Console keyin = System.console();
        
      String acount = keyin.readLine("請輸入帳號: ");                     
      char[] passwd = keyin.readPassword("請輸入密碼: ");
        
      String pwd=new String(passwd);
        
      System.out.println("帳號 :" + acount);
      System.out.println("密碼 :" + pwd);
   }
}  