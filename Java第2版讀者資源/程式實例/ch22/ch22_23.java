import java.io.*;
public class ch22_23 {	
    public static void main(String args[]) throws IOException {
		String[] paths;
		File f = new File("d:\\Java\\ch22");	// 建立File物件
		paths = f.list();						// 取得檔案和目錄
		for (String path:paths) 
			System.out.println(path);			// 列印檔案和目錄名稱
	}
}

