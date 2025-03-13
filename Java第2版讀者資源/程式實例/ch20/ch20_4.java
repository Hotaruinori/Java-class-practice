public class ch20_4 {	
	public static int myDiv(int x, int y) {
		if ( y == 0 ) {		// 檢查除數是否為0, 如果是則不執行除法運算
			System.out.print("除數為0異常發生 : ");
			return 0;
		}
		else
			return x / y;
	}
    public static void main(String args[]){
		System.out.println(myDiv(6, 2)); // 列印6/2除法結果
		System.out.println(myDiv(8, 0)); // 列印8/0除法結果
		System.out.println(myDiv(9, 4)); // 列印9/4除法結果
	}
}

