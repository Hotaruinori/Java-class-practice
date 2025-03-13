public class ch12_4 {
	public static void main(String[] args) {
		char ch1 = '\n';
		System.out.println("\\n 是控制字元" + Character.isISOControl(ch1));
		ch1 = '\t';
		System.out.println("\\t 是控制字元" + Character.isISOControl(ch1));
		System.out.println("@   是控制字元" + Character.isISOControl('@'));
		System.out.println("%   是控制字元" + Character.isISOControl('%'));
	}
}

