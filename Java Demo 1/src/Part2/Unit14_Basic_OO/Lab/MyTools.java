//customized by xxxxx.xxxx
package Part2.Unit14_Basic_OO.Lab;
import java.math.*;
import java.util.Arrays;
public class MyTools{      
    public static int max(int ... nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                int temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
        }
        return nums[nums.length-1];
    }

    public static int min(int ... nums){
        return Arrays.stream(nums).min().orElseThrow();
    }
    // public static int min(int ... nums){
    //     for(int i=0;i<nums.length-1;i++){
    //         if(nums[i]<nums[i+1]){
    //             int temp=nums[i];
    //             nums[i]=nums[i+1];
    //             nums[i+1]=temp;
    //         }
    //     }
    //     return nums[nums.length-1];
    // }

}
