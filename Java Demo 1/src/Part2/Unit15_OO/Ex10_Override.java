package Part2.Unit15_OO;
class Host{
    int num;
    protected void setNum(int num){
        this.num=num;
        System.out.println("num*5= " + num*5);
    }
   
    public static void show(){System.out.println("Hi !");}
}

class SubHost extends Host{
    public void setNum(int num){
        this.num=num;
        System.out.println("num*7= " + num*7);
    }
   
   public void method(){
        this.setNum(4);
        super.setNum(4);
        setNum(4); 
   }
   
    public static void show(){System.out.println("Hello !");}
}
public class Ex10_Override{   
   public static void main(String[] args){	
	    SubHost oo=new SubHost();
	    oo.method();
	    // oo.show();
	   
	    SubHost.show();
	    Host.show();
   }
}
