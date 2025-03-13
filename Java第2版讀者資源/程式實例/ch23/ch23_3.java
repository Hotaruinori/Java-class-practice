import java.io.*;
import java.util.zip.*;
public class ch23_3 {
    public static void main(String[] args) throws IOException {
// 建立欲壓縮的資料夾File物件fileToZip
		File fileToZip = new File("zip23");				
// 建立壓縮目的位置物件
        FileOutputStream zipToSave = new FileOutputStream("ch23_3.zip");
        ZipOutputStream dst = new ZipOutputStream(zipToSave);
// 呼叫方法處理整個資料夾的壓縮
		zipFile(fileToZip, fileToZip.getName(), dst);
		dst.close();								// 關閉輸出串流
	}
// Recursive function
	private static void zipFile(File fileToZip, String fileName, 
								ZipOutputStream dst) throws IOException {
		if (fileToZip.isHidden()) {					// 如果隱藏檔案則不壓縮
            return;
        }
        if (fileToZip.isDirectory()) {				// 如果是資料夾則處理
            File[] files = fileToZip.listFiles();	// 獲得資料夾內所有檔案
            for (File file:files) {
                zipFile(file, fileName + "/" + file.getName(), dst);
            }
            return;
        }
// 如果fileToZip不是隱藏檔案也不是資料夾則執行壓縮處理
		FileInputStream src = new FileInputStream(fileToZip);
// 在壓縮檔案內內建立壓縮項目  
        ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
        dst.putNextEntry(zipEntry);		
// byte方式讀出未壓縮檔案src物件, 然後以zip格式寫入輸出串流dst物件		
        byte[] bytes = new byte[1024];				// 設定的byte陣列空間
        int length;									// 紀錄讀取byte數
        while((length = src.read(bytes)) >= 0) {
            dst.write(bytes, 0, length);			// 以zip格式寫入輸出串流
        }   
        src.close();		// 關閉輸入串流
    }
}
