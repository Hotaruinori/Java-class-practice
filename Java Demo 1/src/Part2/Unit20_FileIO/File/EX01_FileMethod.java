package Part2.Unit20_FileIO.File;
import java.io.File;

public class EX01_FileMethod
{
	public static void myPrint(String s) 
	{
		System.out.print(s);
	}

	public static void main(String[] args)
	{
		File file = new File("D:\\Projects\\Java Demo 1\\src\\Part2\\Unit20_FileIO\\File\\Ex01_FileMethod.java");
		
		myPrint("檔案名稱：" + file.getName() + "\n");	       //取得檔案名稱
		//myPrint("檔案路徑：" + file.getPath() + "\n");	   //取得檔案路徑
		myPrint("絕對路徑：" + file.getAbsolutePath() + "\n"); //取得絕對路徑
		myPrint("目錄位置：" + file.getParent() + "\n");	   //取得上層目錄名稱
		myPrint("檔案大小：" + file.length() + " bytes\n");	   //取得檔案大小
		myPrint("最後修改：" + file.lastModified() + "\n");	   //取得最後修改時間
		
		myPrint("是否存在：");
		myPrint(file.exists() ? "存在\n" : "不存在\n");	       //檢查是否存在
		
		myPrint("可否讀取：");
		myPrint(file.canRead() ? "可讀取\n" : "不可讀\n");	   //檢查是否可讀取
		
		myPrint("可否寫入：");
		myPrint(file.canWrite() ? "可寫入\n" : "不可寫\n");	   //檢查是否可寫入
	}
}
