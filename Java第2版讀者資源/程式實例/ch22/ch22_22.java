import java.io.*;
public class ch22_22 {	
    public static void main(String args[]) throws IOException {
// 刪除檔案
		File f = new File("mych22_21.txt");					// 建立File物件
		boolean bool = f.delete();
		System.out.println("刪除檔案成功   : " + bool);		// 刪除檔案成功
// 刪除資料夾(或稱目錄)
		File fd = new File("mydir22_21");					// 建立File物件
		bool = fd.delete();
		System.out.println("刪除資料夾成功 : " + bool);		// 刪除資料夾成功
	}
}

