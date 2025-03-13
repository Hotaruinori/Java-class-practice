import java.util.regex.*;
public class ch13_28 {
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[abc]?", "a"));	 // true
		System.out.println(Pattern.matches("[abc]?", "ab")); // 最多一個字元
		System.out.println(Pattern.matches("[abc]+", "ab")); // true 	
		System.out.println(Pattern.matches("[abc]*", "ab")); // true
		System.out.println(Pattern.matches("\\D", "a"));     // true
		System.out.println(Pattern.matches("\\D", "1"));     // 不可是數字
		System.out.println(Pattern.matches("\\D*", "abc"));  // true
	}	
}

