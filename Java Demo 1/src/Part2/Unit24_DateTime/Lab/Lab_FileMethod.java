//Lab 顯示 File 的最後修改日期
package Part2.Unit24_DateTime.Lab;
import java.io.File;
import java.util.*;
import java.text.*;

public class Lab_FileMethod
{
	public static void main(String[] args)
	{	    
        File file = new File("D:/Java/jdk-17/bin/javac.exe");
		System.out.println("最後修改時間：" + file.lastModified());
		
		//顯示出年、月、日、時分秒
        System.out.print("最後修改時間：");
		// Insert code to here

		String format = "yyyy/MM/dd a hh:mm";
		DateFormat showday = new SimpleDateFormat(format, Locale.TAIWAN);
		System.out.println(showday.format(file.lastModified()));


	}
}


/*
 * y:西元年
 * Y:西元年	
 * w:week in year
 * W:week in month
 * E:星期
 * M:月份
 * MMM:月份的英文縮寫
 * MMMM:月份的英文
 * d:day in month
 * D:day in year
 * h:12小時制
 * H:24小時制
 * m:分
 * s:秒
 * a:AM/PM
 *
 * 可以指定位數 如 yyyy-MM-dd
 */