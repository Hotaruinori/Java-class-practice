package Part2.Unit19_InnerClass.Anonymous;
public class AnonymousInnerA{
    public static void main(String args[]){  
        (
        	new Host(){
          	
             	void set_num(int n)  //加入新方法
             	{
                	num=n;
                	System.out.println("num*3= " + num*3);
             	}
          	}
        ).set_num(5);   //執行加入的方法
        
    }
}


class Host   //宿主
{
    int num;
}