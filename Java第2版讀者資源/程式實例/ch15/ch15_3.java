class Animal {
	String name = "Dog";
	int age = 5;
}	
public class ch15_3 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		int hd = animal.hashCode();	// Animal類別物件的哈希碼
		System.out.println("animal的hashCode : " + hd);
	}
}

