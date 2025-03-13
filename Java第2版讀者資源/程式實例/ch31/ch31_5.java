import java.net.*;									// 匯入類別庫	
import java.io.*;							
public class ch31_5 { 
	public static void main(String[] args){ 
		String str;		
		try {
			URL url = new URL("https://aaa.24ht.com.tw/ch31Chinese.txt");        
			URLConnection uC = url.openConnection();	
			InputStream stream = uC.getInputStream();
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


