class Dog {
	String name;		// 名字
	String color;		// 顏色
	int age;			// 年齡
	void printInfo() {
		System.out.println("狗名字是 : " + name);
		System.out.println("狗顏色是 : " + name);
		System.out.println("狗年齡是 : " + age);
	}
}

public class ch8_5 {
	public static void main(String[] args) {
		Dog myDog = new Dog();		// 宣告與建立myDog物件
		myDog.printInfo();
	}
}

