import java.util.*;
public class ch25_9 {
    public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("北京");
		list.add("香港");
		list.add("台北");
// 遍歷ArrayList使用forEach()
		list.forEach(info->System.out.println(info));
    }
}

