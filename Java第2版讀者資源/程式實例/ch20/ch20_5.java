public class ch20_5 {	
	public static String myDiv(int x, int y) {
		try {
			return Integer.toString(x/y);	// 將整數轉成字串
		}
		catch(ArithmeticException e) {		// 此區塊捕捉除數為0的異常
			System.out.println("除數為0的異常" + e);
			return "執行除法運算時須避開除數為0的";
		}
	}
    public static void main(String args[]){
		System.out.println(myDiv(6, 2)); 	// 列印6/2除法結果
		System.out.println(myDiv(8, 0)); 	// 列印8/0除法結果
		System.out.println(myDiv(9, 4)); 	// 列印9/4除法結果
	}
}

