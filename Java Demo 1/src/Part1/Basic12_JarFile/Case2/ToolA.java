//�u��c A
package tw.com.kuo;
import java.util.Arrays;

public class ToolA
{
    public void showName()
    {  
        System.out.println("�ڬO�u��cTool A");
        System.out.println();
    }
    
    public static int max(int...nums)
    {
        Arrays.sort(nums);
        return nums[nums.length-1];        
    }
}