import java.io.*;
import java.util.zip.*;
public class ch23_4 {
    public static void main(String[] args) throws IOException {
		File mydir = new File("myDir");					// 建立存放解壓縮檔案的資料夾
		if (mydir.mkdir())								// 正式建立
			System.out.println(mydir.getName() + "儲存解壓縮檔案的資料夾建立成功");
		else
			System.out.println(mydir.getName() + "資料夾已存在建立失敗");
		
		byte[] buffer = new byte[1024];					// 每次處理陣列空間大小是1024
        FileInputStream srcFile = new FileInputStream("ch23_3.zip");//來源檔案串流物件
        ZipInputStream src = new ZipInputStream(srcFile); // 建立ZipInputStream物件
        ZipEntry zipEntry = src.getNextEntry();			// 讀取壓縮檔案內的項目
        while(zipEntry != null){						// 如果不是null則解壓縮
            String fName = zipEntry.getName();			// 取得欲解壓縮的檔案名稱
            File nName = new File(mydir + "/" + fName);	// 設定解壓縮結果的路徑和檔名
            FileOutputStream dst = new FileOutputStream(nName);	// 宣告輸出物件
            int len;
            while ((len = src.read(buffer)) > 0) {		// 讀取zip格式的檔案
                dst.write(buffer, 0, len);				// 用普通格式輸出
            }
            dst.close();								// 關閉輸出串流
            zipEntry = src.getNextEntry();				// 取得下一個被壓縮檔案的項目
        }
        src.close();									// 關閉輸入串流
    }
}

