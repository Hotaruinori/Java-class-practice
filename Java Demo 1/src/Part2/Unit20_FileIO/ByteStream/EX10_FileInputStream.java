package Part2.Unit20_FileIO.ByteStream;
import java.io.*;

public class EX10_FileInputStream
{
	static void myPrint(String s)
	{	
		System.out.println(s);
	}

	public static void main(String[] args) throws Exception
	{
		int size;
		FileInputStream file = new FileInputStream("D:\\Projects\\Java Demo 1\\src\\Part2\\Unit20_FileIO\\ByteStream\\EX10_FileInputStream.java");
		
        myPrint("總位元組數：" + (size = file.available()));//顯示位元組總數
        myPrint("讀取 " + size + " 位元組....");            //顯示讀取的位元組數
		byte[] data = new byte[size];	                    //宣告記憶體緩衝器
		
		if(file.read(data) != size)		                    //若讀取資料 != size
		{
            myPrint("不能讀取 !");   
		}	
		
        myPrint(new String(data));
		file.close();
	}
}
