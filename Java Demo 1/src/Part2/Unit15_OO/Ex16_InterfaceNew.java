package Part2.Unit15_OO;
interface NewInterface
{
    static final int COUNT=100;
    
    abstract void area();
   
    default void show()  //default方法
    {
        System.out.println("NewInterface_default 方法:" + "Hi everyone !!");
    }
   
    static void showData()  //static方法
    {
        System.out.println("NewInterface_static方法:" + "Good day !!");
    }
}


class Ex16_InterfaceNew implements NewInterface
{
    public void area(){}
    
    public static void main(String[] nana)
    {
        new Ex16_InterfaceNew().show();
        NewInterface.showData();
    }        
}
