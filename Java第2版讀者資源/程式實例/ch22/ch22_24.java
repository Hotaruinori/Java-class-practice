import java.io.*;
public class ch22_24 {	
    public static void main(String args[]) throws IOException {
		File[] paths;
		File f = new File("d:\\Java\\ch22");	// 建立File物件
		paths = f.listFiles();					// 取得檔案和目錄
		for (File path:paths) 
			System.out.println(path);			// 列印檔案和目錄名稱
	}
}

