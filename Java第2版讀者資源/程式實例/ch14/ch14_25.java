class Animal {
	public final void moving() {	// 宣告為final方法
		System.out.println("動物可以活動");
	}
}
class Cat extends Animal {
	public void moving() {			// 重新定義final方法產生錯誤
		System.out.println("貓可以走路和跳");
	}
}
public class ch14_25 {
	public static void main(String[] args) {
		Animal a = new Animal();	// 父類別動物物件
		Cat c = new Cat();			// 子類別貓物件
		a.moving();					// 呼叫父類別moving()方法
		c.moving();					// 呼叫子類別moving()方法
	}
}

