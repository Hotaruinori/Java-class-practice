import myMath.*;							// 依需求類別宣告
import myMath.subMath.*;					// 依需求類別宣告
public class ch19_15 {					
	public static void main(String args[]){
		CalAdd obj1 = new CalAdd();
		CalSub obj2 = new CalSub();
		System.out.println(obj1.add(5, 10));	// 執行加法運算
		System.out.println(obj2.sub(5, 10));	// 執行減法運算
	}
}

