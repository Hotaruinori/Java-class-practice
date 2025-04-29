package Part2.Unit17_String_Regular.Matches;
public class StringMatches2 
{
    public static void main(String[] args) 
    {
        String str="【電腦】";
        //String str="abcde";
        //String str="12345";
               
        if(str.matches("^[\u0391-\uFFE5]+$"))  //繁體中文編碼範圍
            System.out.println("是中文");
        else
            System.out.println("不是中文");
    }
}