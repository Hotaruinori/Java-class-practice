//���]�h�ӮM��
import tw.com.kuo.ToolA;
import com.lccnet.ToolB;

public class TestMyTools
{
    public static void main(String args[])
    {
        System.out.println("���զh�ӮM�����O���]���@��Jar�ɮ�\n");
      
        ToolA oo=new ToolA();
        oo.showName(); //��ܤu��cA���W��
        
        System.out.println("�̤j��:" + ToolA.max(15, 10, 35));
        System.out.println();
     
        ToolB pp=new ToolB();
        pp.showName(); //��ܤu��cB���W��
    }
}  