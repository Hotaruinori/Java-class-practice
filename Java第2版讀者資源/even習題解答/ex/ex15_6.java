class Employee {
	String name;
	int age;
	String hometown;
	String country;	
	Employee(String name, int age, String hometown, String country) {
		this.name = name;
		this.age = age;
		this.hometown = hometown;
		this.country = country;
	}
	@Override
	public String toString() {
		return this.name + "今年" + this.age + "家鄉是" + this.hometown + "國籍是" + this.country;
	}
}	
public class ex15_6 {
	public static void main(String[] args) {
		Employee A = new Employee("John", 20, "杭州", "中國");
		System.out.println("列出物件 A : " + A);  	
	}
}

