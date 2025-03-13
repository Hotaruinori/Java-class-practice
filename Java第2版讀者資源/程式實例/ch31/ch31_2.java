import java.net.*;										
public class ch31_2 { 
	public static void main(String[] args){ 
		try {
			InetAddress ip;
			ip = InetAddress.getByName("www.facebook.com");	// 取得IP
			System.out.println("臉書facebook IP : " + ip);
		}
		catch(UnknownHostException e) 
		{
			System.out.println(e);
		}
	}
}


