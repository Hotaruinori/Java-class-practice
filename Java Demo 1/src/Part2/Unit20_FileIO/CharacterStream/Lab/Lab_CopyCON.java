
import java.io.*;

public class Lab_CopyCON
{
    public static void main(String[] args)
    {
        String str;
        
        try {    
            
            if (args.length == 0) {
                System.err.println("please enter the file name");
                System.exit(1);
            }

            BufferedReader input = new BufferedReader(
                                        new InputStreamReader(System.in));
            BufferedWriter files = new BufferedWriter(
                                        new FileWriter(args[0]));

        
            //Instert code
            System.out.println("please enter the Input");
            
           
            while ((str = input.readLine()) != null) {
                
                if (str == ""){
                    break;
                }
                else{
                    files.write(str);    
                    files.newLine();
                } 
            }
            

            input.close();    
            files.close();

        }
        catch(IOException e){}
        
        catch(Exception e){          
            e.printStackTrace();
        }
    }
}
