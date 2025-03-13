import java.io.*;
import java.util.zip.*;
public class ch23_2 {
    public static void main(String[] args) throws IOException {
		String[] srcFiles = { "ch23_1.txt", "ch23_2.txt" };
// 建立壓縮目的位置物件
        FileOutputStream zipToSave = new FileOutputStream("ch23_2.zip");
        ZipOutputStream dst = new ZipOutputStream(zipToSave);
		for ( String srcFile:srcFiles ) {
// 建立欲壓縮的檔案File的物件src
			File fileToZip = new File(srcFile);
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
        dst.close();			// 關閉輸出串流    
    }
}

