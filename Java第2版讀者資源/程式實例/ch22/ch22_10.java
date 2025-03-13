import java.io.*;
public class ch22_10 {	
    public static void main(String args[]) throws IOException {
		int i;
		FileReader fr = new FileReader("ch22_8.txt");
		FileWriter fw = new FileWriter("ch22_10.txt");
		while ( (i = fr.read()) != -1 ) {	// 讀字元直到檔案末端
			char ch = (char) i;				// 將整數轉成字元
			fw.write(ch);					// 輸出到檔案
		}
		fr.close();
		fw.close();
		System.out.println("複製檔案成功!"); 
	}
}

				