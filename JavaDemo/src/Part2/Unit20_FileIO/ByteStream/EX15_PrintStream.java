package Part2.Unit20_FileIO.ByteStream;
import java.io.*;

public class EX15_PrintStream
{
    public static void main(String[] args) throws Exception
    {
        PrintStream output=new PrintStream(
                               new FileOutputStream("EX15.txt"));
                               
        int sum=0;
        for(int i=1;i<=100;i++)
        {
            sum+=i;
        }    
        
        output.print("1+2+...+100=" + sum + '\n');
        output.printf("1+2+...+100=%d\n",sum); 
        output.println("1+2+...+100=" + sum);
        
        System.out.println("成功寫入EX15.txt");
        output.close();
    }
}
             