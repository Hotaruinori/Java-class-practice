class Animal {
	private String name;						// 動物名字
	Animal(String name) {						// 建構方法設定名字
		this.name = name;
	}
	public void eat( ) {						// 方法eat
		System.out.println(name + "正在吃食物");
	}
	public void sleep( ) {						// 方法sleep
		System.out.println(name + "正在睡覺");
	}
}
public class ch14_1 {
	public static void main(String[] args) {
		Animal animal = new Animal("Lily");
		animal.eat();
		animal.sleep();
	}
}

