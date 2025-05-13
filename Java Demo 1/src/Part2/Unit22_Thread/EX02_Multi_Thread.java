package Part2.Unit22_Thread;
class EX02 extends Thread 
{
    private String id;
    public EX02(String str)
    {
        id=str;
    }
   
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try {
                Thread.sleep(1000);
            }
            catch(Exception e){}
            System.out.println(id + " is running..");
        } 
    }
}

 
public class EX02_Multi_Thread
{
    public static void main(String args[])
    {  
        EX02 dog=new EX02("doggy");
        EX02 cat=new EX02("kitty");
        EX02 bear=new EX02("pooh");
      
        System.out.println("開始 -\n");
        dog.start();
        cat.start();
        bear.start();
    }
}
