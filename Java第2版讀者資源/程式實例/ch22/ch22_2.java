import java.io.*;
public class ch22_2 {	
    public static void main(String args[]){
		try {
			FileOutputStream obj = new FileOutputStream("ch22_2.txt");
			String str = "明志科技大學MINGCHI University歡迎你們";
			byte[] bArray = str.getBytes();		// 字元陣列改為byte陣列
			obj.write(bArray);					// 輸出Byte陣列資料
			obj.close();
			System.out.println("輸出成功!"); 
		}			
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

