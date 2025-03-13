import java.util.*;
public class ch24_7 {
    public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		for (int i=10; i<=50; i+=10)
			list.add(i);				// 建立list		
		System.out.println("插入元素前列印元素 : " + list);
		list.set(1, 100);				// 更改索引1元素為100
		list.add(100);					// 末端插入元素100
		System.out.println("編輯後列印元素     : " + list);
		System.out.print("第一次出現100的元素索引   : ");
		System.out.println(list.indexOf(100));
		System.out.print("最後一次出現100的元素索引 : ");
		System.out.println(list.lastIndexOf(100));
    }
}

