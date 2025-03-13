public class ch24_02 {	
	public static <E> void outputArray(E[] elements) {
		for(E element:elements)
			System.out.println(element);			// 列印元素
	}
	public static void main(String[] args) {
		Integer[] intarray = {5, 10, 30, 50, 20};	// 定義整數陣列
		Character[] chararray = {'J','A','V','A'};	// 定義字元陣列
		
		System.out.println("整數陣列");				
		outputArray(intarray);						// 列印整數陣列
		System.out.println("字元陣列");				
		outputArray(chararray);						// 列印字元陣列
	}
}

