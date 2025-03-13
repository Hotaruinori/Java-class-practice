import java.util.*;
public class ch24_13 {
    public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("北京");
		list.add("香港");
		list.add("台北");
// 建立ListIterator物件litr和遍歷
		ListIterator<String> litr = list.listIterator();	
		System.out.println("從前面到後面遍歷");
		while(litr.hasNext())
			System.out.println(litr.next());
		System.out.println("從後面到前面遍歷");
		while(litr.hasPrevious())
			System.out.println(litr.previous());
    }
}

