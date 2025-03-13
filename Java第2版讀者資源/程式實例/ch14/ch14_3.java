class Bird {
	private String name;						// 動物名字
	Bird (String name) {						// 建構方法設定名字
		this.name = name;
	}
	public void eat( ) {						// 方法eat
		System.out.println(name + "正在吃食物");	
	}
	public void sleep( ) {						// 方法sleep
		System.out.println(name + "正在睡覺");
	}
	public void flying() {						// 方法fly
		System.out.println(name + "正在飛");
	}
}
public class ch14_3 {
	public static void main(String[] args) {
		Bird bird = new Bird("Cici");
		bird.eat();
		bird.sleep();
		bird.flying();
	}
}

