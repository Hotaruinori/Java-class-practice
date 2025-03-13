import java.io.*;
public class ch22_16 {	
    public static void main(String args[]) throws IOException {
		FileOutputStream fo = new FileOutputStream("ch22_16.txt");
		PrintStream ps = new PrintStream(fo);
		String str = "王者歸來";
		ps.println(str);						// 輸出字串資料
		ps.println("Java入門邁向高手之路");		// 輸出字串資料
		ps.println("作者:洪錦魁");				// 輸出字串資料
		int age = 35;
		ps.println("作者今年 " + age + " 歲");	// 輸出整數資料
		ps.close();
		fo.close();
		System.out.println("輸出成功!"); 		// 這是輸出到螢幕
	}
}

