
class EX01 
{
   private String id;
   public EX01(String str)
   {
      id=str;
   }
   
   public void run()
   {
      for(int i=1; i<=5; i++)
      {
         try {
            Thread.sleep(1000);
         }
         catch(Exception e){}
         System.out.println(id + " is running..");
      } 
   }
}

 
public class EX01_Single_Thread
{
   public static void main(String args[])
   {  
      EX01 dog=new EX01("doggy");
      EX01 cat=new EX01("kitty");
      EX01 bear=new EX01("pooh");
      
      System.out.println("¶}©l -\n");
      dog.run();
      cat.run();
      bear.run();
   }
}
