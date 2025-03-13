public class ch12_32 {
	public static void main(String[] args) {
		String str = "明志科技大學";
		StringBuilder bstr = new StringBuilder(str);
		System.out.println("字串緩衝區物件內容   : " + bstr);
		System.out.println("字串緩衝區物件長度   : " + bstr.length());
		System.out.println("字串緩衝區物件容量   : " + bstr.capacity());
// 以下更改字串緩衝區容量
		System.out.println("以下重點是更改字串緩衝區容量");
		bstr.ensureCapacity(10);		// 小於舊容量原容量不更改
		System.out.println("新字串緩衝區物件容量 : " + bstr.capacity());
		bstr.ensureCapacity(30);		// 大於舊容量原容量乘2再加2
		System.out.println("新字串緩衝區物件容量 : " + bstr.capacity());
// 以下更改字串緩衝區物件長度
		System.out.println("以下重點是更改字串緩衝區物件長度");
		bstr.setLength(8);				// 將字串緩衝區物件長度改為8
		System.out.println("新字串緩衝區物件內容 : " + bstr);
		System.out.println("新字串緩衝區物件長度 : " + bstr.length());
		System.out.println("新字串緩衝區物件容量 : " + bstr.capacity());
		bstr.setLength(4);				// 將字串緩衝區物件長度改為4
		System.out.println("新字串緩衝區物件內容 : " + bstr);
		System.out.println("新字串緩衝區物件長度 : " + bstr.length());
		System.out.println("新字串緩衝區物件容量 : " + bstr.capacity());
	}
}

