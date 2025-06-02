
public class LambdaBasic 
{
    public static void main(String[] args) 
    {
        Runnable myRun=() -> System.out.println("running now");
        
        new Thread(myRun).start();     
    }
}


// javap -c LambdaBasic