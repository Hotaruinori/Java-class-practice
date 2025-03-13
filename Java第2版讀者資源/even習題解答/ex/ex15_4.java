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
}	
public class ex15_4 {
	public static void main(String[] args) {
		Employee A = new Employee("John", 20, "杭州", "中國");
		Employee B = new Employee("Peter", 22, "廈門", "中國");
		Employee C = new Employee("Kevin", 20, "東京", "日本");
		System.out.println("A = B : " + A.equals(B));  	// 使用Object的equals
		System.out.println("A = C : " + A.equals(C));	// 使用Object的equals
		System.out.println("B = C : " + B.equals(C));	// 使用Object的equals
	}
}

