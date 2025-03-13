public class ch13_2 {
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
	public static void parseString(String str) {
		boolean notFoundSignal = true;					// 註記沒找到電話號碼為true
		for ( int i = 0; i < (str.length()-11); i++ ) {	// 用迴圈逐步抽取12個字元做測試
			String msg = new String();					// 建立空字串
			msg = str.substring(i, i+12);				// 取得字串
			if (taiwanPhone(msg)) {
				System.out.println("電話號碼是 : " + msg);
				notFoundSignal = false;
			}	
		}
		if ( notFoundSignal )			// 如果沒有找到電話號碼則列印
			System.out.println(str + " 字串不含電話號碼");		
	}
	public static void main(String[] args) {
		String msg1 = "Please call my secretary using 0930-919-919 or 0952-001-001";
		String msg2 = "請明天17:30和我一起參加明志科大教師節晚餐";
		String msg3 = "請明天17:30和我一起參加明志科大教師節晚餐, 可用0933-080-080聯絡我";
		parseString(msg1);
		parseString(msg2);
		parseString(msg3);
	}
}

