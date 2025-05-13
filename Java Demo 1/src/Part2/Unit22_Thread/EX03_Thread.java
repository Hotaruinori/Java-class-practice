package Part2.Unit22_Thread;
class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
            System.out.println(Thread.currentThread().getName() + ": " + i);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e){}
		}
	}
}


class MyThread2 extends Thread
{
    public void run()
    {
        for(int i=1; i<=6; i++)
        {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try
            {
                Thread.sleep(200);
            }
            catch(Exception e){}
        }
    }
}

public class EX03_Thread
{  
    public static void main(String args[]) throws InterruptedException
    {
        MyThread1 mt1 =new MyThread1();
        MyThread1 mt2 =new MyThread1();
        MyThread2 mt3 =new MyThread2();
        MyThread2 mt4 =new MyThread2();

        mt1.setName("1_1");
        mt2.setName("1_2");
        mt3.setName("2_1");
        mt4.setName("2_2");
        
        System.out.println("開始-\n");
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
        for(int i=1;i<=10;i++)
        {
            System.out.printf("Main Thread: %2d 目前Thread個數: %d",i,Thread.activeCount());
            System.out.println("\n");
            Thread.sleep(500);
        }
    }
}
