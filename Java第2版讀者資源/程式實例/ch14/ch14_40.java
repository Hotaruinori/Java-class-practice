class Animal {
	String moving() {
		return "動物可以活動";
	}
}
class myCat {
	public void showMsg(Animal obj) {	// 接收類別當參數
		System.out.println("匿名類別當參數傳送 : " + obj.moving());
	}
}
public class ch14_40 {
	public static void main(String[] args) {
		myCat obj = new myCat(); 		// 建立MyCat類別物件
		obj.showMsg(new Animal() {		// 所傳遞的參數是匿名內部類別
			public String moving() {
				return "貓可以走路和跳";
			}
		});
	}
}

