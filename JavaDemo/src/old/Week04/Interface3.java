package Week04;


public class Interface3 {

	public static void main(String[] args) {
    //向上類型轉換

		BB bb = new BB();
		AA aa = bb;
		aa.output();
        
        // 向下類型轉換
        // AA aa = new BB();
		// BB bb = (BB)aa;
		// bb.output();

	}
}

interface AA
{
	public void output();
}

class BB implements AA
{
	public void output()
	{
		System.out.println("BB");
	}
}
