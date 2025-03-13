class Animal {
	public void eat( ) {			// Animal方法eat
		System.out.println("正在吃食物");
	}
	public void sleep( ) {			// Animal方法sleep
		System.out.println("正在睡覺");
	}
}
class Dog extends Animal {
	public void barking() {			// Dog類別自有的方法barking
		System.out.println("正在叫");
	}
}
public class ch14_4 {
	public static void main(String[] args) {
		Dog dog = new Dog();		
		dog.eat();					// dog繼承Animal方法eat()
		dog.sleep();				// dog繼承Animal方法sleep()
		dog.barking();				// Dog類別自有的方法
	}
}

