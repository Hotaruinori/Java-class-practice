class Animal {
	String name = "Dog";
	int age = 5;
	@Override
	public String toString( ) {							// 重新定義toString()
		return this.name + " 今年 " + this.age + " 歲";
	}
}	
public class ch15_7 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println("列出物件 : " + animal);  	// 使用重新定義的toString()
	}
}

