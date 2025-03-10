package Week03;


public class ConstructorOverload {

	public static void main(String[] args) {

		ConstructorOverload construtor = new ConstructorOverload();
	}

	public ConstructorOverload()
	{
             this(3);   //表示執行建構子
		System.out.println("test");
	}
	
	public ConstructorOverload(int i)
	{
		System.out.println(++i);
	}
}


//建構子重載, 只需看參數個數及型別即可