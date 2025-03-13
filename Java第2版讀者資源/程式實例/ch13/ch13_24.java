public class ch13_24 {
	public static void main(String[] args) {
		String str = "請明天17:30和我一起參加明志科大教師節晚餐, 可用0933-080-080聯絡我";
		String pattern = "\\d{4}(-\\d{3}){2}";		// 正規表達式以小括號處理分組
		System.out.println(str.replaceFirst(pattern, "****-***-***"));
	}
}

