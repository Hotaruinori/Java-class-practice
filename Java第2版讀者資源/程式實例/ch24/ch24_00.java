class MyData {							// 整數資料
	int obj;
	void setobj(int obj) {
		this.obj = obj;					// 設定整數
	}
	int getobj() {
		return this.obj;				// 回傳整數
	}
}
public class ch24_00 {	
	public static void main(String[] args) {
		MyData m = new MyData();		// 建立物件
		m.setobj(10);					// 設定整數值
		System.out.println(m.getobj());	// 列印整數值
	}
}

