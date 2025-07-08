package Part2.Unit14_Basic_OO.Lab;
import Part2.Unit14_Basic_OO.Lab.MyTools;

public class Test{
    public static void main(String[] args){
        int x=25,y=30;
        int a=15, b=20, c=12;
        int[] nums = {15, 8, 25, 48, 2, 10};
        System.out.println("x,y 的最大值:" + MyTools.max(x, y));  
        System.out.println("a,b,c 的最大值:" + MyTools.max(a, b, c));
        System.out.println("int[] nums 的最小值:" + MyTools.min(nums));  
    }
}   