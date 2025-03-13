class Animal {
	private String name;			// 定義動物名字
	Animal(String name) {			// 建構方法設定名字
		this.name = name;
	}
	public void eat() {				// Animal方法eat
		System.out.println(name + "正在吃食物");
	}
	public void sleep() {			// Animal方法sleep
		System.out.println(name + "正在睡覺");
	}
}
class Dog extends Animal {
	Dog(String name) {				// Dog建構方法
		super(name);				// 呼叫父類別建構方法
	}
	public void barking() {			// Dog類別自有的方法barking
		System.out.println("正在叫");
	}
}
public class ch14_7 {
	public static void main(String[] args) {
		Dog dog = new Dog("Haly");		
		dog.eat();					// dog繼承Animal方法eat()
		dog.sleep();				// dog繼承Animal方法sleep()
		dog.barking();				// Dog類別自有的方法
	}
}

