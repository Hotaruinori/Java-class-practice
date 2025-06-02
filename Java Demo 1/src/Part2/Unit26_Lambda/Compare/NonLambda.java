
public class NonLambda 
{
    public static void main(String[] args) 
    {
        Runnable myRun=new Runnable(){
        	
            public void run() 
            {
                System.out.println("running now ...");   
            }
        };
            
        new Thread(myRun).start();     
    }
}



// javap -c NonLambda