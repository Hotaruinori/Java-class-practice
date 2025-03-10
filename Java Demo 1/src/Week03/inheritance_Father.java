package Week03;

public class inheritance_Father {
    int x;
    int y;

    public void giveMoney(){
        System.out.println("give money");
    }

    public inheritance_Father(){
       System.out.println("沒錢啦");
    }

    public inheritance_Father(int i){
       System.out.println("給的零用錢為 " + i + "元") ;
    }
        
    
}
