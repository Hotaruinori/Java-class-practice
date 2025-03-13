public class ch18_2 {
	public static void main(String[] args) {
	// 方法 1
		int x = 5;							// 整數x
		Integer xObj = new Integer(x);		// 整數物件xObj
	// 方法2	
		Integer yObj = new Integer(10); 	// 整數物件yObj	

		System.out.println("xObj所屬類別 : " + xObj.getClass());
		System.out.println("yObj所屬類別 : " + yObj.getClass());	
	}
}

