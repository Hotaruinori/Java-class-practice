//打包多個套件
import tw.com.kuo.ToolA;
import com.lccnet.ToolB;

public class TestMyTools
{
    public static void main(String args[])
    {
        System.out.println("測試多個套件的類別打包成一個Jar檔案\n");
      
        ToolA oo=new ToolA();
        oo.showName(); //顯示工具箱A的名稱
        
        System.out.println("最大值:" + ToolA.max(15, 10, 35));
        System.out.println();
     
        ToolB pp=new ToolB();
        pp.showName(); //顯示工具箱B的名稱
    }
}  