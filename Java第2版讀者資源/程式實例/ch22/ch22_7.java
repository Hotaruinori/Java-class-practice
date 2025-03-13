import java.io.*;
public class ch22_7 {	
    public static void main(String args[]){
		try {
			FileInputStream obj = new FileInputStream("ch22_6.txt");
			BufferedInputStream buf = new BufferedInputStream(obj);
			int b;								// 暫時儲存byte資料
			while ((b = buf.read()) != -1) {
				System.out.print((char) b);		// Byte資料輸出到螢幕
			}			
			buf.close();					
			obj.close();
			System.out.println("\nBufferedInputStream測試成功!"); 
		}			
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

