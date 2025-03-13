import java.io.*;
import java.util.*;
public class ex22_2 {	
    public static void main(String args[]) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("請輸入來源檔案 : ");
		String src = scanner.next();
		System.out.printf("請輸入目的檔案 : ");
		String dst = scanner.next();
		int i;
		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(dst);
		while ( (i = fr.read()) != -1 ) {	// 讀字元直到檔案末端
			char ch = (char) i;				// 將整數轉成字元
			fw.write(ch);					// 輸出到檔案
		}
		fr.close();
		fw.close();
		System.out.println("複製檔案成功!"); 
	}
}

				