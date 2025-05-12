
import java.io.*;
import java.util.Scanner;

public class TryWith3 
{
    public static void main(String[] agrs)
    {
        String name="TryWith3.java";
        String str;
        
        try( Scanner input = new Scanner(new FileInputStream(name)) ) {
        
            while(input.hasNext()) 
            {
                System.out.println(input.nextLine());
            }
        } 
        catch(FileNotFoundException e) {
        
            System.out.println("Hi");
        }
    }
}


// try( Scanner input = new Scanner(new FileReader(name)) ) {