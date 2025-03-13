import java.io.*;
public class ch22_21 {	
    public static void main(String args[]) throws IOException {
// 建立檔案
		File f = new File("ch22_21.txt");					// 建立File物件
		if (f.createNewFile()) 								// 建立新檔案
			System.out.println(f.getName( ) + " 檔案建立成功");
		else
			System.out.println("檔案已存在建檔失敗");		// 輸出建檔失敗
// 建立資料夾(或稱目錄)
		File fd = new File("dir22_21");						// 建立File物件
		if (fd.mkdir()) 									// 建立新資料夾
			System.out.println(fd.getName() + " 資料夾建立成功");
		else
			System.out.println("資料夾已存在建立失敗");		// 建資料夾失敗
// 更改檔案名稱		
		File newf = new File("mych22_21.txt");				// 建立新File物件
		boolean bool = f.renameTo(newf);					// 更改檔名
		System.out.println("更改檔案名稱成功 : " + bool);	// 列出是否成功
		System.out.println("新檔案名稱 : " + newf.getName());	
// 更改資料夾名稱		
		File newfd = new File("mydir22_21");				// 建立新File物件
		bool = fd.renameTo(newfd);							// 更改資料夾名稱
		System.out.println("更改資夾名稱成功 : " + bool);	// 列出是否成功
		System.out.println("新資料夾名稱 : " + newfd.getName());
	}
}

