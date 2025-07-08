package Part2.Unit14_Basic_OO;
public class Ex06_VariableLengthArgument
{ 
    // public static String sum(int...nums, String arg)  
    public static String sum(String arg, int...nums)  
    {
        int total = 0;
        for( int x = 0; x < nums.length; x++ )
        {
            total += nums[x];
        }
        return arg + String.valueOf(total);
    }
         
    public static void main(String[] args) 
    {
        
        System.out.println(sum("1+2 = ",1,2));
        System.out.println(sum("1+2+3 = ",1,2,3));
        System.out.println(sum("1+2+3+4 = ",1,2,3,4));
        System.out.println(sum("1+2+3+4+5 = ",1,2,3,4,5));
        
    }
}