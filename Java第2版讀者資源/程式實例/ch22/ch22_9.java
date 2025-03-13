import java.io.*;
public class ch22_9 {	
    public static void main(String args[]){
		int i;
		try {
			FileReader fr = new FileReader("ch22_8.txt");
			while ( (i = fr.read()) != -1 ) {	// 讀字元直到檔案末端
				char ch = (char) i;				// 將整數轉成字元
				System.out.print(ch);			// 輸出字元
			}
			fr.close();
			System.out.println("\n輸出成功!"); 
		}			
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

