class Dog {
	String name = "Lily";			// 名字
	void printInfo() {
		System.out.println("狗名字是 : " + name);
	}
}

public class ch8_6 {
	public static void main(String[] args) {
		Dog aDog, bDog, cDog;		// 宣告aDog, bDog, cDog物件
		aDog = new Dog();
		bDog = new Dog();
		cDog = new Dog();
		System.out.println("aDog == bDog : " + (aDog == bDog) + "  " + aDog.name);
		System.out.println("aDog == cDog : " + (aDog == cDog) + "  " + bDog.name);
		System.out.println("bDog == cDog : " + (bDog == cDog) + "  " + cDog.name);
		
		bDog = cDog;				// bDog和cDog指向相同位置
		System.out.println("bDog == cDog : " + (bDog == cDog));
		
		bDog.name = "Hali";			// 更改bDog的name屬性
		
		aDog.printInfo();			// 列印狗名字
		bDog.printInfo();			// 列印狗名字
		cDog.printInfo();			// 列印狗名字
	}
}

