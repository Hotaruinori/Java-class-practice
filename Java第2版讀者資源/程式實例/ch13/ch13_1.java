public class ch13_1 {
	public static boolean taiwanPhone(String str) {
		if (str.length() != 12)			// 如果長度不是12
			return false;				// 傳回非手機號碼格式
		for ( int i = 0; i <= 3; i++ )	// 如果索引前4個字元出現非數字字元
			if (Character.isDigit(str.charAt(i)) == false)
				return false;			// 傳回非手機號碼格式
		if (str.charAt(4) != '-')		// 如果不是'-'字元
			return false;				// 傳回非手機號碼格式
		for ( int i = 5; i <= 7; i++ )	// 如果索引5-7字元出現非數字字元
			if (Character.isDigit(str.charAt(i)) == false)
				return false;			// 傳回非手機號碼格式
		if (str.charAt(8) != '-')		// 如果不是'-'字元
			return false;				// 傳回非手機號碼格式
		for ( int i = 9; i <= 11; i++ )	// 如果索引9-11字元出現非數字字元
			if (Character.isDigit(str.charAt(i)) == false)
				return false;			// 傳回非手機號碼格式	
		return true;					// 通過以上考驗傳回true
	}
	public static void main(String[] args) {		
		System.out.println("I love Java :是台灣手機號碼" + taiwanPhone("I love Java"));
		System.out.println("0952-909-090:是台灣手機號碼" + taiwanPhone("0952-909-090"));
		System.out.println("1111-1111111:是台灣手機號碼" + taiwanPhone("111-11111111"));
	}
}

