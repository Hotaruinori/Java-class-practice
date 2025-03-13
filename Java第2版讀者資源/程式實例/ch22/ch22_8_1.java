import java.io.*;
public class ch22_8_1 {	
    public static void main(String args[]){
		try {
			FileWriter fw = new FileWriter("ch22_8.txt", true);
			fw.write('\n');					// 加上分行符號
			String str = "新北市泰山鄉";
			fw.write(str);					// 輸出Byte陣列資料
			fw.close();
			System.out.println("輸出成功!"); 
		}			
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

