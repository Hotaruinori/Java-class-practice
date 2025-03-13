class Person {
	public static int age;						// 所有物件共享此份資料
	public String name;							// 每一個物件有一份此資料
	public Person(String name) {
		this.name = name;
	}
	public void output() {
		System.out.println("Name: " + name);
		System.out.println("Age:  " + age);
	}
}

public class ch9_18 {
	public static void main(String[] args) {
		Person.age = 20;						// 可以在宣告物件前設定age
		Person P1 = new Person("Peter");
		Person P2 = new Person("John");
		P1.output();
		P2.output();
		Person.age = 30;						// 也可以在宣告物件後設定age
		P1.output();
		P2.output();
	}
}
 
