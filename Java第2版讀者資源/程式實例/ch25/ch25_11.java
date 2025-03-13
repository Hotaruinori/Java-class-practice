import java.util.*;
public class ch25_11 {
    public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("北京");
		list.add("香港");
		list.add("台北");
// 遍歷ArrayList使用forEach()搭配method reference
		list.forEach(System.out::println);	// 方法參照
    }
}

