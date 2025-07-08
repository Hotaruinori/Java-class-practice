package Part2.Unit18_TryCatch;
public class Ex06_MethodThrow
{
    public static void div(int a,int b) throws ArithmeticException
    {
        int c;
        c=a/b;
        System.out.println(a + "/" + b + "=" + c);      
    }
     
    public static void main(String[] args)
    {  
        
        try{ 
         
            Ex06_MethodThrow.div(4,0);
        }
        catch(ArithmeticException e){
         
            System.out.println("除數是0");  
        } 

/*          
        try{ 
         
            Thread.sleep(1000);  //時間的延遲
        }
        catch(InterruptedException e){ }
*/         
        
    }
    
}  