package Week04;

public class Polymorphism {
	public static void main(String[] args) {

		//Rose rose = new Rose();
		Flower rose = new Rose(); // 多態
		rose.sing();
	}
}

class Flower {
	public void sing() {
		System.out.println("flower is singing");
	}
}
class Rose extends Flower {

}
