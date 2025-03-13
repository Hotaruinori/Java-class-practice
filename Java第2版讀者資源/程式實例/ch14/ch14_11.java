class Animal {
	protected String name;			// 宣告protected存取修飾符定義動物名字
	Animal(String name) {			// 建構方法最初化name
		this.name = name;
	}
	public void eat() {				// Animal方法eat
		System.out.println(name + "正在吃食物");
	}
}
class Mammal extends Animal {
	protected String favorite_food;
	Mammal(String name, String favorite_food) {		// 建構方法最初化name
		super(name);								// 呼叫父類別建構方法
		this.favorite_food = favorite_food;			// 最喜歡的食物	
	}
	public void favoriteFood() {
		System.out.println(name + " 喜歡吃 " + favorite_food);
	}	
}
class Cat extends Mammal {
	Cat(String name, String favorite_food) {		// Cat建構方法
		super(name, favorite_food);					// 呼叫父類別建構方法
	}
	public void jumping() {							// Cat類別自有的方法jumping
		System.out.println(name + "正在叫");		// 可以繼承name了
	}
}
public class ch14_11 {
	public static void main(String[] args) {
		Cat cat = new Cat("lucy", "fish");		
		cat.eat();					// cat繼承Animal方法eat()
		cat.favoriteFood();			// cat繼承Mammal方法favoriteFood()
		cat.jumping();				// cat類別自有的方法
	}
}

