import java.io.*;
public class ch22_11 {	
    public static void main(String args[]) throws IOException {
		FileWriter writer = new FileWriter("ch22_11.txt");
		BufferedWriter bw = new BufferedWriter(writer);
		String str = "明志科技大學歡迎你們";
		bw.write(str, 0, 6);					// 輸出部分字串資料
		bw.newLine();							// 寫出分行符號
		bw.write(str, 6, str.length()-6);		// 輸出部分字串資料
		bw.close();
		System.out.println("輸出成功!"); 
	}
}

