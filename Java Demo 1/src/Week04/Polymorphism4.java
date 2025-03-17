package Week04;

public class Polymorphism4 {
	public static void main(String[] args) {
    	Fruit c = new Apple();
    	c.sing();
		
		Apple d = (Apple)c;
		d.sing();
		
		Fruit f = new Apple();
		//f.run();   //錯誤，因為父類無此方法
		Apple a = (Apple)f;
		a.run();
	}
}

class Fruit {
	public void sing() {
		System.out.println("Fruit is singing");
	}
}

class Apple extends Fruit {
	public void sing() {
		System.out.println("Apple is singing");
	}
	public void run() {
		System.out.println("Apple is running");
	}
}
