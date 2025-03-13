class Dog {
	String name;		// 名字
	String color;		// 顏色
	int age;			// 年齡
	void barking( ) {	// 方法barking()
		System.out.println("正在叫");
	}
	void sleeping( ) {	// 方法sleeping()
		System.out.println("正在睡覺");
	}
}

public class ch8_3 {
	public static void main(String[] args) {
		Dog myDog = new Dog();		// 宣告與建立myDog物件
		Dog TomDog = new Dog(); 	// 宣告與建立TomDog物件
		
		myDog.name = "Lily";		// 設定myDog的name屬性
		System.out.print("我的狗名字是 " + myDog.name + " ");
		myDog.barking();			// 呼叫方法barking()
		
		TomDog.name = "Hali"; 		// 設定TomDog的name屬性
		System.out.print("Tom的狗名字是 " + TomDog.name + " ");
		myDog.sleeping();			// 呼叫方法sleeping()
	}
}

