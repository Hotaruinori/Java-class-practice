package Part2.Unit21_TryWithResources;
import java.io.*;

public class TryWith2
{
    public static void main(String[] agrs) throws IOException
    {
        String name=("D:\\Projects\\Java Demo 1\\src\\Part2\\Unit21_TryWithResources\\TryWith2.java");
        String str;
        
        try( BufferedReader input=new BufferedReader( new FileReader(name) ) ) {
        
           while((str = input.readLine())!= null)
           {
               System.out.println(str);
           }    
        }
        catch(FileNotFoundException e) {
        
            System.out.println("Hi");
        }



//or
        try( BufferedReader input=new BufferedReader( new FileReader(name) ) ) {
        
           while((str = input.readLine())!= null)
           {
               System.out.println(str);
           }    
        }       
    }
}
