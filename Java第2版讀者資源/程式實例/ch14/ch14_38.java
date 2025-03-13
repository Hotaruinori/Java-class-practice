class Animal {
	public void moving() {
		System.out.println("動物可以活動");
	}
}
public class ch14_38 {
	public static void main(String[] args) {
		Animal inner = new Animal() {		// 宣告匿名內部類別物件
			public void moving() {
				System.out.println("貓可以走路和跳");
			}
		};
		inner.moving();						// 執行呼叫moving( )方法					
	}
}

