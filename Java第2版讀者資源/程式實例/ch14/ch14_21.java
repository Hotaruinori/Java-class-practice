class Animal {
	public void moving() {
		System.out.println("動物可以活動");
	}
}
class Cat extends Animal {
	public void moving() {
		super.moving();				// 呼叫父類別的moving()方法
		System.out.println("貓可以走路和跳");
	}
}
public class ch14_21 {
	public static void main(String[] args) {
		Cat c = new Cat();			// 子類別貓物件
		c.moving();					// 呼叫子類別moving()方法
	}
}

