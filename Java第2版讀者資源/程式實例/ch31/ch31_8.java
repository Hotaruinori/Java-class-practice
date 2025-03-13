import java.net.*;									// 匯入類別庫	
import java.io.*;							
public class ch31_8 { 
	public static void main(String[] args){ 
		String str;		
		try {
			URL url = new URL("https://aaa.24ht.com.tw/"); // 網頁       
			URLConnection uC = url.openConnection();	
			InputStream stream = uC.getInputStream();
			InputStreamReader isr = new InputStreamReader(stream,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			while ((str=br.readLine())!=null)		// 讀取整行
				System.out.println(str);			// 輸出
			br.close();								// 關閉
		} 
		catch(Exception e) 
		{
			System.out.println(e);
		}	
	}
}


