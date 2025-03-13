class SmallMath {
	int add(int x, int...y) {						// 可變參數的應用
		int total = x;
		for ( int num:y )
			total += num;
		return total;								// 單純傳回整數值
	}		
}
public class ch8_11_1 {
	public static void main(String[] args) {
		SmallMath A = new SmallMath();				// 定義類別SmallMath的物件A
		int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(A.add(1, 3));			// 計算1 + 3
		System.out.println(A.add(1, 3, 5));			// 計算1 + 3 + 5
		System.out.println(A.add(5, values));		// 計算5 + values陣列	
	}
}

