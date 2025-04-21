package Part1.Basic7_String.Parameters.Lab;
//參數檢查與轉換
class GetTemperature
{    
    float getC(float c) 
    {
        float f;
        f = ((9 * c) / 5) + 32; //攝氏轉成華氏  
        return f;   
    }
    
    public void showResult(String[] args)
    {       
        for(int n=0; n<args.length; n++)
        {
            if(!args[n].matches("^[0-9]+$"))
            {
                System.err.println("參數有非數字");
                System.out.println("請重新輸入!");
                System.exit(0);
            }
               
            float c = Float.parseFloat(args[n]);
        
            System.out.println(c + "°C = " + getC(c) + "°F");
        }           
    }    
} 

  
public class Lab_C2F_OK
{
	public static void main(String[] args)
	{
        if(args.length == 0)
        {
           System.err.println("必要參數遺失!");
           System.exit(0);
        }   
        
        GetTemperature oo=new GetTemperature();
        oo.showResult(args);
	}
}