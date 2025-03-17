package Week04;
public class Polymorphism2 {
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.sing();

		Child child = new Child();
		child.sing();

		Parent p = new Child(); // p指向誰, 呼叫的就是誰的方法
		p.sing();
	}
}

class Parent {
	public void sing() {
		System.out.println("Parent is singing");
	}
}

class Child extends Parent {
	public void sing() {
		System.out.println("Child is singing");
	}
}
