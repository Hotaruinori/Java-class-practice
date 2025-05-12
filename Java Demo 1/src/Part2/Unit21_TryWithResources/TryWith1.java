
class Resource implements AutoCloseable 
{
    void doSomething() throws Exception
    {
        System.out.println("Do something\n");
        //throw new Exception();
    }

    public void close() 
    {
        System.out.println("close()被叫用了");
        System.out.println("資源被關閉");
    }
}

public class TryWith1 
{    
    public static void main(String[] args) 
    {
        try(Resource res = new Resource()) 
        {
            res.doSomething();
        } 
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }
}
