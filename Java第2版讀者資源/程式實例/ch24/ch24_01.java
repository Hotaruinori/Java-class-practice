class MyData<T>{									// 泛型資料
	private T obj;				
	void setobj(T obj) {
		this.obj = obj;								// 設定泛型
	}
	public T getobj() {
		return this.obj;							// 回傳泛型
	}
}
public class ch24_01 {	
	public static void main(String[] args) {
		MyData<Integer> m = new MyData<Integer>();	// 建立整數物件
		m.setobj(10);								// 設定整數值
		System.out.println(m.getobj());				// 列印整數值
		MyData<Double> d = new MyData<Double>();	// 建立雙倍經度浮點數物件
		d.setobj(10.0);								// 設定雙倍經度浮點數值
		System.out.println(d.getobj());				// 列印雙倍經度浮點數值
		MyData<String> str = new MyData<String>();	// 建立字串物件
		str.setobj("王者歸來");						// 設定字串
		System.out.println(str.getobj());			// 列印字串
	}
}

