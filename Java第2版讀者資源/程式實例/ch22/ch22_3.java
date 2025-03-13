import java.io.*;
public class ch22_3 {	
    public static void main(String args[]){
		try {
			FileInputStream obj = new FileInputStream("ch22_1.txt");
			int b = obj.read();				// 讀取1個Byte資料
			System.out.println((char) b); 	// Byte資料轉為字元輸出
			obj.close();
			System.out.println("讀取成功!"); 
		}			
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

