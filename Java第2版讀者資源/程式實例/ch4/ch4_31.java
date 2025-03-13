public class ch4_31 {
	public static void main(String[] args) {
		int x, i, j;
		i = j = 5;
		x = ++i + j++ * 3;		
		System.out.println("x = " + x);
		x = i++ + ++j * 3;
		System.out.println("x = " + x);	 
	}
}

