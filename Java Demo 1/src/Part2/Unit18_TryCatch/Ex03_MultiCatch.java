package Part2.Unit18_TryCatch;
public class Ex03_MultiCatch
{
    public static void main(String[] args)
    {
        int i;
        
        try {  
       
            String str = args[0];  // 產生超過陣列範圍例外
          
            for(i=3; i>-2; i--)
                System.out.println("計算結果: " + 6/i);
        }
        catch( ArithmeticException e ) {
       
            //處理除數為零
            System.out.println("\n例外原因: " + e.getMessage()); 
            System.out.print("例外說明: ");
            e.printStackTrace();
            System.out.println();
          
        }
        catch( ArrayIndexOutOfBoundsException e ) {
       
            //處理超過陣列索引範圍
            System.out.println("\n例外原因: " + e.getMessage()); 
            System.out.print("例外說明: ");
            e.printStackTrace();
            System.out.println();
        }
        catch( IndexOutOfBoundsException e ) {
       
            //處理索引超過範圍
            System.out.println("\n例外說明: " + e.getMessage()); 
            System.out.print("例外原因: ");
            e.printStackTrace();
            System.out.println();
        }
        catch( Exception e ){}
        finally {
       
            System.out.println("例外處理完成\n");
        }
       
        System.out.println("程式結束!");
    }
    
}