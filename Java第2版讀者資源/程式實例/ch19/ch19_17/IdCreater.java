package id;									// 建立套件id
import java.util.Random;					// 匯入單一類別名稱宣告
public class IdCreater {					// 類別名稱是IdCreater
	private int id;
	private static int idInitial; 			// 最初化id編號
	static {								// 靜態最初化id編號
		Random ran = new Random();
		idInitial = ran.nextInt(10) * 1000;	
	}
	public IdCreater( ) {					// 建構方法
		id = ++idInitial;					// 產生id編號
	}
	public int getID() {
	   return id;							// 傳回id編號
   }
}

