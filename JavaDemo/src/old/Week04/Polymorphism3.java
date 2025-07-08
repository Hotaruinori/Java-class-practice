package Week04;

public class Polymorphism3 {
	public static void main(String[] args) {
		/*
		 * Animal animal = new Cat(); 
                     * Animal animal2 = new Animal();
		 * 
		 * animal2 = animal; 
                     * animal2.sing();
		 */

		Animal animal = new Cat();
		Animal animal2 = new Animal();

		animal = animal2;
		animal.sing();
	}
}

class Animal {
	public void sing() {
		System.out.println("Animal is singing");
	}
}

class Dog extends Animal {
	public void sing() {
		System.out.println("Dog is singing");
	}
}

class Cat extends Animal {
	public void sing() {
		System.out.println("Cat is singing");
	}
}
