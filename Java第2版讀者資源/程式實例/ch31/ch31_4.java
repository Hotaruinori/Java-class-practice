import java.net.*;									// 匯入類別庫	
import java.io.*;							
public class ch31_4 { 
	public static void main(String[] args){ 
		String str;		
		try {
			URL url = new URL("https://aaa.24ht.com.tw/ch31Example.txt");        
			URLConnection uC = url.openConnection();	
			InputStream stream = uC.getInputStream();
			System.out.println("檔案大小是 : " + uC.getContentLength());
			System.out.println("檔案類型是 : " + uC.getContentType());
			int i;
			while((i=stream.read())!=-1) {			// 讀取檔案直到最後
				System.out.print((char) i);			// 輸出所讀取的資料
			}
		} 
		catch(Exception e) 
		{
			System.out.println(e);
		}	
	}
}


