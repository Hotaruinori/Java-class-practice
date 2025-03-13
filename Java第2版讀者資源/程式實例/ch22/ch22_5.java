import java.io.*;
public class ch22_5 {	
    public static void main(String args[]){
		try {
			FileInputStream src = new FileInputStream("洪錦魁1.jpg");
			FileOutputStream dst = new FileOutputStream("洪錦魁2.jpg");
			
			System.out.println("檔案大小 : " + src.available()); 
			byte[] pic = new byte[src.available()];		// 建立pic陣列
			
			src.read(pic);			// 從輸入串流讀取圖檔資料存入pic陣列
			dst.write(pic);			// 將pic陣列資料寫到輸出串流
			src.close();
			dst.close();
			System.out.println("圖檔拷貝"); 
		}			
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

