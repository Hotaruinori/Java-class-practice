import java.io.*;
public class ch22_1 {	
    public static void main(String args[]){
		try {
			FileOutputStream obj = new FileOutputStream("D:\\Java\\ch22\\ch22_1.txt");
			obj.write(70);						// 輸出Byte資料
			obj.close();
			System.out.println("輸出成功!"); 
		}			
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

