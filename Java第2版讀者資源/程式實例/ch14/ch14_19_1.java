public class ch14_19_1 {
	public static void main(String[] args) {
		HomeTown hometown = new HomeTown("長沙", "湖南", "中國");	  // 家鄉物件
		Employee em = new Employee(12, 29, 'F', "劉嫻慶", hometown);  // 員工物件 
		em.printInfo();
	}
}

