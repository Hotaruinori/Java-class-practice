// 請修正錯誤, 但不允許以刪除來處理

public class TestException 
{
	public static void main (String[] args)
	{
        doSomething();
	}
   
	private static void doSomething()
	{
        doSomeThingElse();
	}
   
	private static void doSomeThingElse()
	{
        throw new Exception();
	}
	
}