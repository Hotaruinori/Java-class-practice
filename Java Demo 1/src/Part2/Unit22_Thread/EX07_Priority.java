
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
             System.out.println("���_�ҥ~");
        }
    }
}


public class EX07_Priority 
{
	public static void main(String args[])
	{    
        EX07 mt1 = new EX07("�����1");
        EX07 mt2 = new EX07("�����2");
        EX07 mt3 = new EX07("�����3");
        
		mt1.setPriority(1);
        mt2.setPriority(10);
        
        System.out.println("�}�l-\n");
        mt1.start();
		mt2.start();
		mt3.start();
	}
}
