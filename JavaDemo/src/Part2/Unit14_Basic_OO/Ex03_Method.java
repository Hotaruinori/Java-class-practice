package Part2.Unit14_Basic_OO;
public class Ex03_Method
{
    public static void myprint(String str)
    {
        System.out.print(str);
    }     

    public static void main(String[] args) 
    {
        int x, y;
        for ( x = 1; x <= 7; x+=3 )
        {        
            for ( y = 1; y <= 9; y++ )
            {
                Ex03_Method.myprint(x+"*"+y+"="+x*y+'\t');
              
                //同一個類別可以省略類別名稱      
                myprint((x+1)+"*"+y+"="+(x+1)*y+'\t');
                myprint((x+2)+"*"+y+"="+(x+2)*y+'\n');
            } 
            myprint("\n");
        }
    }
}    
  
 
 
  
  
  
  
    
/*    
    public void methodA()
    {
        methodB();
    }
    
    public void methodB()
    {
        System.out.println("叫用者是 methodA");
    }
*/        
