package Part2.Unit22_Thread;
class EX08 extends Thread
{
    private String id;
    
    public EX08(String str)
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
            System.out.println(id + " is running..");
            //System.out.println(Thread.activeCount());
        } 
    }
}


public class EX08_Join
{
    public static void main(String[] args) throws InterruptedException
    {  
        EX08 dog=new EX08("doggy");
        EX08 cat=new EX08("kitty");
        EX08 bear=new EX08("pooh");
      
        System.out.println("開始 -\n");
        dog.start(); 
        dog.join(1000); 
        cat.start();
        bear.start();
      
        System.out.println("Main thread finished.\n");  
    }
}
