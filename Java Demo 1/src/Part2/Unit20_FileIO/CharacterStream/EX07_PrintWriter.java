package Part2.Unit20_FileIO.CharacterStream;
import java.io.*;

public class EX07_PrintWriter
{
    public static void main(String[] args) throws Exception
    {
        int i,j,k;                   

        PrintWriter output=new PrintWriter(
                               new FileWriter("EX07.txt"));
                               
        for(i=1;i<=5;i++)
        {
            for(j=0;j<5-i;j++)
            {
                output.print(" ");
            }
               
            for(k=1;k<=i*2-1;k++)
            {
                output.print("*"); 
            } 
             
            output.println();
            output.print('\n');
            output.printf("%n");
           
        }
        output.println("Successfully written to EX07.txt");
        output.close();
        
        System.out.println("成功寫入EX07.txt");
    }
}
