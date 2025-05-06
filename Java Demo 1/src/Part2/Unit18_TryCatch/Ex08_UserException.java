package Part2.Unit18_TryCatch;

class MyException extends IndexOutOfBoundsException{	 //使用者自訂例外類別

	private int a;
	MyException(int a) {
		this.a = a;
	}
	
    public String toString(){
		return "索引值 " + a + " 超出範圍";
	}
}

public class Ex08_UserException{
	static int[] numer = {10, 20, 30};
	static int[] denom = {2, 5, 3};
	static int[] quotient = new int[3];
	
	static void division(int i)throws MyException{
		if(i>=3)	
			throw new MyException(i);
		else
			quotient[i] = numer[i]/denom[i];
			
		System.out.print(numer[i] + "/" + denom[i] + "=");
		System.out.println(quotient[i]);
	}
	
	public static void main(String[] args){
        MyException me = new MyException(3);
        
        try {
		
			for(int i=0; i<=3; i++)
				division(i);
		}
        catch(MyException e) { 
		
			System.out.println( e );
		}
	}
	
}