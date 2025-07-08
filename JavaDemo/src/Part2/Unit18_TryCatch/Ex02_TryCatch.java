package Part2.Unit18_TryCatch;
public class Ex02_TryCatch
{
    public static void main(String[] args)
    {
        int i;
        try {  
       
            for(i=4; i>-2; i--) 
                System.out.println("計算結果: " + 12/i);
             
        }
        catch( ArithmeticException e ) {
            
            System.out.println();
            System.out.println("getMessage()回傳的原因: " + e.getMessage()); 
            System.out.println("toString()回傳的原因: " + e.toString());
            System.out.println();
            System.out.print("例外說明: ");
            e.printStackTrace();
            System.out.println();
            System.out.println(e);
        }
        finally {
       
            System.out.println("例外處理完成");
        }
       
        System.out.println("程式結束!");
    }
    
}
