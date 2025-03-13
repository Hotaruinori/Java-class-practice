class Animal {
	public void moving() {
		System.out.println("動物可以活動");
	}
}
public class ch14_39 {
	public static void main(String[] args) {
		new Animal() {					// 沒有宣告物件
			public void moving() {
				System.out.println("貓可以走路和跳");
			}
		}.moving();						// 直接呼叫方法
	}
}

