package Part2.Unit22_Thread;
class Base{ }
  
class MyThreadA extends Base implements Runnable
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

class MyThreadB extends Base implements Runnable
{
    public void run()
    {
        for(int i=1; i<=6; i++)
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


public class EX04_Runnable
{  
    public static void main(String args[]) throws InterruptedException
    {
        MyThreadA obj1 = new MyThreadA();
        MyThreadA obj2 = new MyThreadA();
        MyThreadB obj3 = new MyThreadB();
        MyThreadB obj4 = new MyThreadB();
        
        //Thread 物件名稱 = new Thread(Runnable物件 [,標題內容]);
        Thread mt1 = new Thread(obj1);
        Thread mt2 = new Thread(obj2);
        Thread mt3 = new Thread(obj3);
        Thread mt4 = new Thread(obj4);
        
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
