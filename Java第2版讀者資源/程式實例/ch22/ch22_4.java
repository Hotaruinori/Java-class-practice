import java.io.*;
public class ch22_4 {	
    public static void main(String args[]){
		try {
			FileInputStream obj = new FileInputStream("ch22_2.txt");
			int b = obj.read();					// 讀取1個Byte資料
			while ((b = obj.read()) != -1) {	// 是否讀到檔案末端
				System.out.print((char) b); 	// Byte資料轉為字元輸出
			}
			obj.close();
			System.out.println("讀取成功!"); 
		}			
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

