// �Эץ����~, �������\�H�R���ӳB�z

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