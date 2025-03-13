import java.io.*;
public class ch22_12 {	
    public static void main(String args[]) throws IOException {
		FileReader fr = new FileReader("ch22_11.txt");
		BufferedReader br = new BufferedReader(fr);
		int i;
		while ((i = br.read()) != -1) 		// 迴圈讀到檔案末端
			System.out.print((char)i);		// 輸出字元資料		
		fr.close();
		br.close();
	}
}

