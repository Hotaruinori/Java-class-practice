class Father {
	protected int x = 50;
}
class Child extends Father {
	protected int x = 100;
	public void printInfo(){
		System.out.println("列印Father類別 x : " + super.x);
		System.out.println("列印Child 類別 x : " + x);
	}
}
public class ch14_14 {
	public static void main(String[] args) {
		Father father = new Father();	// 建立父類別物件
		Child child = new Child();		// 建立子類別物件
		child.printInfo();
	}
}

