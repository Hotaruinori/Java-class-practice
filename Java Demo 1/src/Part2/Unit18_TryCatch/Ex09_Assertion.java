package Part2.Unit18_TryCatch;
public class Ex09_Assertion
{
    public static void main(String[] args) 
    {
        int x = 165;
        int y = 97;
        int max;
        
        max = (x>=y)? x : y;
        
        assert false : "assertion發生了";
        
        System.out.println("最大值為: " + max);
    }
    
}