package Part1.Basic6_Wrapper;
public class Wrapper05_CheckChar
{
    public static void main(String[] args)
	{
	    String s = "1234X6Y8";
	    //顯示所有位非數字字元的索引值
	   
        int len = s.length();
       
        for( int n=0; n<len; n++ )
        {
            if(!Character.isDigit(s.charAt(n)))
            {
                System.err.println("索引值 " + n + " 不是數字字元");
                //break;
            }
        }      
    }
}