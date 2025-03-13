class Animal {
	Animal() {						// Animal建構方法
		System.out.println("執行Animal建構方法 ... ");
	}
	public void eat() {				// Animal方法eat
		System.out.println("正在吃食物");
	}
	public void sleep() {			// Animal方法sleep
		System.out.println("正在睡覺");
	}
}
class Dog extends Animal {
	Dog() {							// Dog建構方法
		System.out.println("執行Dog建構方法 ... ");
	}
	public void barking() {			// Dog類別自有的方法barking
		System.out.println("正在叫");
	}
}
public class ch14_5 {
	public static void main(String[] args) {
		Dog dog = new Dog();		
		dog.eat();					// dog繼承Animal方法eat()
		dog.sleep();				// dog繼承Animal方法sleep()
		dog.barking();				// Dog類別自有的方法
	}
}

