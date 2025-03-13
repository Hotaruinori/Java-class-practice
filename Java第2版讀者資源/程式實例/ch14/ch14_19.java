public class ch14_19 {
	public static void main(String[] args) {
		HomeTown hometown = new HomeTown("徐州", "江蘇", "中國");	// 家鄉物件
		Employee em = new Employee(10, 29, 'F', "周佳", hometown);	// 員工物件 
		em.printInfo();
	}
}

