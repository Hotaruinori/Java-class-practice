
class EX07 extends Thread
{
    String getThreadName;
    int getPriority;
    
    public EX07(String threadName)
    {
        getThreadName = threadName;
    }

    public void run()
    {
        try
        {
            for(int i=1; i<=5; i++)
            {
                 System.out.println(getThreadName + " Running");
                 Thread.sleep(800);
            }
        }
        catch(InterruptedException e)
        {
             System.out.println("中斷例外");
        }
    }
}


public class EX07_Priority 
{
	public static void main(String args[])
	{    
        EX07 mt1 = new EX07("執行緒1");
        EX07 mt2 = new EX07("執行緒2");
        EX07 mt3 = new EX07("執行緒3");
        
		mt1.setPriority(1);
        mt2.setPriority(10);
        
        System.out.println("開始-\n");
        mt1.start();
		mt2.start();
		mt3.start();
	}
}
