import java.io.*;
public class ch22_20 {	
    public static void main(String args[]) throws IOException {
		File f = new File("ch22_19.txt");					// 建立File物件
		System.out.println("檔案存在 : " + f.exists());  	// 測試檔案是否存在
		System.out.println("檔案名稱 : " + f.getName());	// 輸出檔案名稱
		System.out.println("父路徑   : " + f.getParent());	// 輸出父路徑
	}
}

