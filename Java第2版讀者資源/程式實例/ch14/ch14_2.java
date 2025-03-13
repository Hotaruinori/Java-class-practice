class Dog {
	private String name;						// 動物名字
	Dog (String name) {							// 建構方法設定名字
		this.name = name;
	}
	public void eat( ) {						// 方法eat
		System.out.println(name + "正在吃食物");	
	}
	public void sleep( ) {						// 方法sleep
		System.out.println(name + "正在睡覺");
	}
	public void barking() {						// 方法barking
		System.out.println(name + "正在叫");
	}
}
public class ch14_2 {
	public static void main(String[] args) {
		Dog dog = new Dog("Haly");
		dog.eat();
		dog.sleep();
		dog.barking();
	}
}

