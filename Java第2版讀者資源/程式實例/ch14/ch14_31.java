class Animal {
	public void walk() {		
		System.out.println("Animal is walking.");
	}
}
class Dog extends Animal {			
	public void walk() {		
		System.out.println("Dog is walking");
	}
}
class Cat extends Animal {			
	public void walk() {		
		System.out.println("Cat is walking");
	}
}
public class ch14_31 {
	public static void main(String[] args) {
		Animal animal = new Dog();		// Upcasting
		animal.walk();
		Dog dog = (Dog) animal;			// Downcasting
		dog.walk();
// Error frequently
//		Dog dog = (Dog) new Animal(); 	
	}
}

