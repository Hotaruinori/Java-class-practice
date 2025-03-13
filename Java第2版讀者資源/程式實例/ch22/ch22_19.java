import java.io.*;
public class ch22_19 {	
    public static void main(String args[]) throws IOException {
		File f = new File("d:\\Java\\ch22\\ch22_19.txt");		// 建立File物件
		System.out.println("檔案存在 : " + f.exists());  		// 測試檔案是否存在
		if (f.createNewFile()) {								// 建立新檔案
			System.out.println("檔案建立成功");
			System.out.println("檔案存在 : " + f.exists());  	// 測試檔案是否存在
			System.out.println("檔名     : " + f.getName());	// 輸出檔名
			System.out.println("父路徑   : " + f.getParent());	// 父路徑
			System.out.println("絕對路徑 : " + f.getAbsolutePath());// 絕對路徑
			System.out.println("是檔案   : " + f.isFile());		// 測試是否檔案
			System.out.println("是目錄   : " + f.isDirectory());	// 測試是否目錄
			System.out.println("絕對路徑 : " + f.isAbsolute());	// 是否絕對路徑
			System.out.println("可讀     : " + f.canRead());	// 是否可讀
			System.out.println("可寫     : " + f.canWrite());	// 是否可寫
			System.out.println("設唯讀   : " + f.setReadOnly());// 設唯讀
			System.out.println("可寫     : " + f.canWrite());	// 是否可寫
			System.out.println("設可讀寫 : " + f.setWritable(true));	// 設可寫
			System.out.println("可寫     : " + f.canWrite());	// 是否可寫
		}
		else
			System.out.println("檔案已存在建檔失敗");			// 輸出建檔失敗
	}
}

