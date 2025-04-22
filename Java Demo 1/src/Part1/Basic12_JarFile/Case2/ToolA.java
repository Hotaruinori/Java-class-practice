//工具箱 A
package tw.com.kuo;
import java.util.Arrays;

public class ToolA
{
    public void showName()
    {  
        System.out.println("我是工具箱Tool A");
        System.out.println();
    }
    
    public static int max(int...nums)
    {
        Arrays.sort(nums);
        return nums[nums.length-1];        
    }
}