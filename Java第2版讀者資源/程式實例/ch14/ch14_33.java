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
public class ch14_33 {
	public static void main(String[] args) {
		Animal animal = new Dog();		// Upcasting
		animal.walk();
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;		// Downcasting
			dog.walk();
		}
	}
}

