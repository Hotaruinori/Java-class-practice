import java.util.*;
public class ch24_12 {
    public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<Integer>(); 
		for (int i=10; i<=50; i+=10) {					// 模擬enqueue
			queue.addLast(i);							// 建立queue		
			System.out.println("queue : " + queue);
		}
		int loop = queue.size();						// 元素個數
		for (int i=1; i<=loop; i++ ) {					// dequeue迴圈
			System.out.printf("dequeue第%d筆元素 %d : \n",i ,queue.removeFirst());
			System.out.println("queue : " + queue);
		}
    }
}

