class Animal {
	String name = "Dog";
	int age = 5;
}	
public class ch15_6 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println("列出物件 : " + animal);  	// 使用Object的toString()
	}
}

