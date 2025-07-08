package Part2.Unit22_Thread;
public class EX06_Sleep implements Runnable 
{
    public void run() 
    {
        for(int i=10; i<13; i++) 
        {

            System.out.println(Thread.currentThread().getName() + ": " + i);
            try{
                // thread to sleep for 1000 milliseconds plus 500 nanoseconds
                Thread.sleep(1000, 500);
            } 
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws Exception 
    {
        Thread thread = new Thread(new EX06_Sleep());
        // this will call run() function
        thread.start();

        Thread thread2 = new Thread(new EX06_Sleep());
        // this will call run() function
        thread2.start();
    }
}
