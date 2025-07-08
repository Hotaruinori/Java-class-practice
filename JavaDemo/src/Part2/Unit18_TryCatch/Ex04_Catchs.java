//7.0版的新語法:catch可以合併
package Part2.Unit18_TryCatch;
public class Ex04_Catchs
{
    public static void main(String[] args)
    {
        int i;
        
        try {  
       
            String str = args[0];
          
            for(i=3; i>-2; i--)
                System.out.println("計算結果: " + 6/i);
        }
        catch( ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e ) { /* 例外處理 */ }
       
        catch( IndexOutOfBoundsException e ){ /* 例外處理 */ }
       
        catch( Exception e ){}
       
        finally {
       
            System.out.println("例外處理完成\n");
        }
       
        System.out.println("程式結束!");
    }
    
}