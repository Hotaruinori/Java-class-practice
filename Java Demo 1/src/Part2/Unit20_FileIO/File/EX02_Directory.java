package Part2.Unit20_FileIO.File;
import java.io.File;

public class EX02_Directory
{
	public static void myPrint(String s)
	{
		System.out.print(s);
	}
	
	public static void main(String[] args)
	{
		String path = "D:/Java";	//定義工作路徑
		File file = new File(path);	//建立檔案類別
        if(file.isDirectory())        //測試是否為目錄
		{	
            myPrint("檔案路徑 " + path + "\n"); //顯示工作路徑
			String s[] = file.list();	//取得目錄中的成員資料
			for(int i=0; i<s.length; i++)
			{
				File fn = new File(path + "/" + s[i]);	//建立路徑與檔名物件
                if(fn.isDirectory())  //檢查是否為目錄
				{	
                    myPrint(s[i] + " 是目錄\n");
				}
				else
				{
                    myPrint(s[i] + " 是檔案\t");
                    
                    myPrint("檔案大小：" + new File(path + "/" + s[i]).length() + "Bytes\n");
				}
			}
		}
		else{
			System.out.println("無此目錄!");
		}
		
	}
}
