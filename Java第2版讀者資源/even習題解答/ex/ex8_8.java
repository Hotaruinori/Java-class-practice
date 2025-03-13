class demoOverload {
	void show(char ch) {
		System.out.println(ch);
	}
	void show(char ch, int n) {
		System.out.println(ch + " " + n);
	}
}
public class ex8_8 {
	public static void main(String[] args) {
		demoOverload obj = new demoOverload();
		obj.show('A');
		obj.show('B', 90);
	}
}

