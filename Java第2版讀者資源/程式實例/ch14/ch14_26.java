class Animal {
	public void moving() {				// 	父類別的moving()方法	
		System.out.println("動物可以活動");
	}
}
class Cat extends Animal {			
	public void moving(String msg) {	// 多重定義父類別的moving()方法	
		System.out.println(msg);
	}
}
public class ch14_26 {
	public static void main(String[] args) {
		Cat c = new Cat();				// 子類別貓物件
		c.moving();						// 呼叫父類別moving()方法
		c.moving("貓可以走路和跳");		// 呼叫子類別moving()方法
	}
}

