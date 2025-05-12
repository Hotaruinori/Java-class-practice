
class CBank
{
    private static int sum=0;
    
    public static void add(int n) 
    {
        synchronized(Object.class)
        //synchronized(new Object())
        {
            int tmp=sum;
            tmp=tmp+n;
            try
            {
                Thread.sleep((int)(1000*Math.random()));
            }
            catch(InterruptedException e){}
             
            sum=tmp;
            System.out.println("sum= " + sum); 
       }
    }
}


class CCustomer extends Thread
{ 
    public void run()
    {
       for(int i=1;i<=3;i++)
       {
          CBank.add(100);      //匯入3次,每次100元
       }
    }
}


public class EX10_Sync
{
    public static void main(String args[])
    {  
       CCustomer c1=new CCustomer();
       CCustomer c2=new CCustomer();
       CCustomer c3=new CCustomer();
      
       System.out.println("開始-\n");
       c1.start();
       c2.start();
       c3.start();
    }
}
