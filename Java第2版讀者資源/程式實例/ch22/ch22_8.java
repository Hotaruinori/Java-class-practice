import java.io.*;
public class ch22_8 {	
    public static void main(String args[]){
		try {
			FileWriter fw = new FileWriter("ch22_8.txt");
			String str = "明志科技大學MINGCHI University歡迎你們";
			fw.write(str);					// 輸出Byte陣列資料
			fw.close();
			System.out.println("輸出成功!"); 
		}			
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

