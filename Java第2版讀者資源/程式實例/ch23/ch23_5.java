import java.io.*;
import java.util.zip.*;
public class ch23_4 {
    public static void main(String[] args) throws IOException {
		File mydir = new File("myDir");				// 建立存放解壓縮檔案的資料夾
		if (mydir.mkdir())							// 正式建立
			System.out.println(mydir.getName() + "儲存解壓縮檔案的資料夾建立成功");
		else
			System.out.println(mydir.getName() + "資料夾已存在建立失敗");
		
        String srcZip = "ch23_3.zip";				// 想要解壓縮的檔案
        byte[] buffer = new byte[1024];				// 每次處理數量陣列
        ZipInputStream src = new ZipInputStream(new FileInputStream(srcZip));
        ZipEntry zipEntry = src.getNextEntry();
        while(zipEntry != null){					// 如果不是null則解壓縮
            String fName = zipEntry.getName();		// 取得欲解壓縮的檔案名稱
            File nName = new File(mydir + "/" + fName);	// 設定解壓縮結果的路徑和檔名
            FileOutputStream dst = new FileOutputStream(nName);	// 宣告輸出物件
            int len;
            while ((len = src.read(buffer)) > 0) {
                dst.write(buffer, 0, len);			// 實際寫入
            }
            dst.close();
            zipEntry = src.getNextEntry();
        }
        src.close();
    }
}
