package Part2.Unit20_FileIO.CharacterStream;
import java.io.*;

public class EX04_ReadText
{
    public static void main(String[] args) throws IOException
    {
        String name = "EX04.txt";
        File file = new File(name);
        
        if(file.exists())
        {
            BufferedReader input = new BufferedReader(
                                        new FileReader(file));
            String str;
           
            while((str = input.readLine())!= null)
            {
                System.out.println(str);
            }
          
            input.close();
        }
        else
        {
            System.out.println("檔案[ " + name + " ]不存在!");
        }  
    }
}














/*
            while(true)
            {
                str=input.readLine();
                if(str == null)
                {
                    break;
                }   
                System.out.println(str);
            } 
*/