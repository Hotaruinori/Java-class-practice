import java.util.*;
public class ch24_22 {
    public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		for (int i=1; i<=10; i++)
			list.add(i);				// 建立list	
		System.out.println("處理shuffle()前list元素 : " + list);
		for (int i=1; i<=5; i++) {		// 迴圈執行5次
			Collections.shuffle(list);	// 重新排列
			System.out.println("處理shuffle()後list元素 : " + list);
		}
    }
}

