import java.util.*;
public class ch25_16 {
    public static void main(String[] args) {
		Set<String> set = Set.of("北京","香港","台北"); 
// 遍歷set使用forEach搭配method reference
		set.forEach(System.out::println);	// 方法參照
    }
}

