class MyClass {
	int age;									// 年齡
	String name;								// 姓名
	MyClass(int age) {							// 建構方法參數是一個整數	
		this.age = age; 						// 設定年齡
	}
	MyClass(String name) {						// 建構方法參數是一個字串
		this.name = name;						// 設定姓名
	}
	MyClass(int age, String name) {				// 建構方法參數是一個整數和字串
		this.age = age;							// 設定年齡
		this.name = name;						// 設定姓名
	}
	void printInfo() {							// 列印成員變數
		System.out.println(name);				// 列印姓名
		System.out.println(age);				// 列印年齡
	}
}
public class ch9_9 {
	public static void main(String[] args) {
		MyClass A = new MyClass(20);
		A.printInfo();
		MyClass B = new MyClass("John");
		B.printInfo();
		MyClass C = new MyClass(25, "Lin");
		C.printInfo();
	}
}
 
