import java.net.*;										
public class ch31_3 { 
	public static void main(String[] args){ 
		try {
			URL url = new URL("https://aaa.24ht.com.tw/travel.jpg");        
			System.out.println("URL 是 " + url.toString());
			System.out.println("protocol 是 " + url.getProtocol());
			System.out.println("authority 是 " + url.getAuthority());
			System.out.println("file name 是 " + url.getFile());
			System.out.println("host 是 " + url.getHost());
			System.out.println("path 是 " + url.getPath());
			System.out.println("port 是 " + url.getPort());
			System.out.println("default port 是 " + url.getDefaultPort());
		} 
		catch(MalformedURLException e) 
		{
			System.out.println(e);
		}	
	}
}


