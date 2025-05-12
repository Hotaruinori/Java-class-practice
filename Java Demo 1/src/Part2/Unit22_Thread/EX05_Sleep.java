
class EX05 extends Thread  
{
    private String id;
    public EX05(String str)
    {   
        id=str;
    }
   
    public void run()
    {    
        for(int i=1; i<=5; i++)
        {
            try
            {
                Thread.sleep((int)(1000*Math.random()));
            }
            catch(InterruptedException e){}
            
            System.out.println(id + " is running...");         
            //System.out.println("total:" + Thread.activeCount());
        } 
    }
}

 
public class EX05_Sleep
{
    public static void main(String args[])
    {  
        EX05 dog=new EX05("doggy");
        EX05 cat=new EX05("kitty");
        EX05 bear=new EX05("pooh");
       
        System.out.println("¶}©l-\n");     
        dog.start(); 
        cat.start();
        bear.start();
      
        System.out.println("Main Thread finished.\n"); 
    }
}
