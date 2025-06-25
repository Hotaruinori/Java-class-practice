package Week05;
import java.util.Arrays;

public class Generic2 {
	public static void main(String[] args) {
		MyArrayList<String> list = new MyArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("berry");		
		System.out.println(list.toString());		
	}
}
class MyArrayList<E>{	
	Object[] obj = new Object[10];
	int size; //初始值0
	
	public boolean add(E e) {
		obj[size] = e;
		size++; //從0開始+1
		return true;
	}
	
	@SuppressWarnings("unchecked") //強制轉換
	public E get(int index) {
		return (E)obj[index];
	}
	
	public String toString() {
		return Arrays.toString(obj);		
	}
}
