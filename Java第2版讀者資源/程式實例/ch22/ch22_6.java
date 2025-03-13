import java.io.*;
public class ch22_6 {	
    public static void main(String args[]){
		try {
			FileOutputStream obj = new FileOutputStream("ch22_6.txt");
			BufferedOutputStream buf = new BufferedOutputStream(obj);
			String str = "Welcome to MINGCHI University of Technology";
			byte[] bArray = str.getBytes();		// 字元陣列改為byte陣列
			buf.write(bArray);					// Byte陣列輸出到緩衝區
			buf.flush();						// 緩衝區資料寫入目的地
			obj.close();
			System.out.println("輸出成功!"); 
		}			
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

