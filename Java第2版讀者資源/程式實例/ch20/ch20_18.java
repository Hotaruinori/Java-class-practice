public class ch20_18 {	
	public static void pwdCheck(String pwdStr) {
		if (pwdStr.length()>=5 && pwdStr.length()<=8) {			// 密碼長度在5-8之間
			System.out.println("密碼內容成功 : " + pwdStr);		// true,列出正確
		}
		else {													// false
			System.out.println("密碼內容失敗 : " + pwdStr);		// 列出失敗
			throw new StringIndexOutOfBoundsException("密碼長度不符規定");	// 拋出異常
		}
	}
    public static void main(String args[]){
		String[] pwd = {"123456", "123456789", "1234567" };		// 密碼字串陣列
		for ( int i = 0; i < pwd.length; i++ ) {				// 檢查所有元素
			try {												// try區塊
				pwdCheck(pwd[i]);
			}
			catch(StringIndexOutOfBoundsException e) {			// catch區塊
				System.out.println("Error! " + e);				// 異常處理程式
				e.printStackTrace();							// 回溯顯示
			}
		}
		System.out.println("測試密碼愉快"); 					// 程式結束列印祝福詞
	}
}

