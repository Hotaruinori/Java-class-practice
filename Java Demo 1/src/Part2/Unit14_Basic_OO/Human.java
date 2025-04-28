
public class Human
{
    //屬性
    int  head=1;  
    int  eyes=2;
    int  nose=1;
    int  mouth=1;
    int  ears=2;
        /*
         :
         :
         :
        */  
        
    //成員方法
    public void  run(int distance)  
    { 
        System.out.println("我跑了" + distance + "公尺");        
    }
    
    public void  eat(String food) 
    { 
        System.out.println("我吃了" + food);        
    }
    
        /*
         :
         :
         :
        */  

    //建構式
    public Human( )  
    {
        /* 由機率決定性別 */
  
    }
    
    
    public Human(String sex)
    {
        /* 由當事人決定性別 */
        
    }
}

class Born	
{
    public static void main(String[] args)  //程式進入點 
	{
        //建立 Human 的物件實體
        Human Adam = new Human();
           
		System.out.print("亞當的眼睛有 ");
		System.out.println( Adam.eyes + " 個");
		System.out.println();
            /*
             :
             :
             :
            */ 
            
        //建立 Human 的物件實體     
        Human Eve;
		Eve = new Human("female");
		
		System.out.print("夏娃說:" );
        Eve.eat("apple");
		System.out.println();
            /*
             :
             :
             :
            */  
    }
}