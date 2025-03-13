import java.util.*;
public class ch24_1 {
    public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("北京");
		list.add("香港");
		list.add("台北");
// 遍歷ArrayList使用foreach
		for(String obj:list)
			System.out.println(obj);
// 遍歷ArrayList使用Iterator物件, 如果還有元素itr.hasNext會傳回true
		Iterator<String> itr = list.iterator();	// 設定itr物件
		while(itr.hasNext())				// 遍歷完成迴圈會中止
			System.out.println(itr.next());	// 傳回元素
    }
}

