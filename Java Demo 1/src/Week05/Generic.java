package Week05;


public class Generic {
	// 定义一个泛型方法，用于打印传入的任何类型参数
	public static <T> void printElement(T element) {
		System.out.println(element);
	}

    // public static int printElement(int i){
    //     System.out.println("我優先" + i);
	// }
    

	public static void main(String[] args) {
		// 示例1：打印整数
		printElement(123);

		// 示例2：打印字符串
		printElement("Hello");

		// 示例3：打印小数
		printElement(45.67);
	}
}
