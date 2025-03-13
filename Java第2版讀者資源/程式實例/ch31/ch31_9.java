import java.net.*;									// 匯入類別庫	
import java.io.*;							
public class ch31_9 { 
	public static void main(String[] args){ 
		String str;		
		try {
// 下列2行是獲得HttpURLConnection物件的方法
			URL url = new URL("https://aaa.24ht.com.tw/");        
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();	
			for (int i=1; i<=8; i++) {				// 取得http網頁的標題資訊
				System.out.println(huc.getHeaderFieldKey(i) +  " = " +
									huc.getHeaderField(i));
			}
			huc.disconnect();		
		} 
		catch(Exception e) 
		{
			System.out.println(e);
		}	
	}
}


