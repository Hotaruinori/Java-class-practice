import java.util.*;
public class ch24_8 {
    public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>(); 
		list.add("北京");
		list.add("香港");
		list.add("台北");
		System.out.println("增加前list : " + list);
		list.addFirst("上海");
		list.addLast("廣州");
		System.out.println("增加後list : " + list);
		System.out.println("第一筆元素   : " + list.getFirst());
		System.out.println("最後一筆元素 : " + list.getLast());
    }
}

