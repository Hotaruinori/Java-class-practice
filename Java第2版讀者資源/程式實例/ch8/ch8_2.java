class Dog {
	String name;		// 名字
	String color;		// 顏色
	int age;			// 年齡
	void barking( ) {	// 方法barking()
		System.out.println("我的狗在叫");
	}
}

public class ch8_2 {
	public static void main(String[] args) {
		Dog myDog = new Dog();		// 宣告與建立myDog物件
		myDog.name = "Lily";		// 設定myDog的name屬性
		myDog.color = "White";		// 設定myDog的color屬性
		myDog.age = 5;				// 設定myDog的age屬性
		System.out.println("我的狗名字是 : " + myDog.name);
		System.out.println("我的狗顏色是 : " + myDog.color);
		System.out.println("我的狗年齡是 : " + myDog.age);	
		myDog.barking();			// 呼叫方法barking()
	}
}

