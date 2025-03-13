class IcCard {	
	final static int valueAdd = 1000;
}

public class ch9_22 {
	public static void main(String[] args) {
		IcCard A = new IcCard();
		A.valueAdd = 2000;		// 企圖修改final static成員變數產生錯誤
	}
}
 
