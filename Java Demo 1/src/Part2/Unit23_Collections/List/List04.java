
import java.util.*;

public class List04
{
	public static void main(String[] args)
	{
        List<String> v1 = new Vector<>();
		v1.add("Lily");
		v1.add("Lulu");
		v1.add("Nana");
		v1.add("Diana");
		v1.add("Anna");
		
        for(String s : v1) System.out.println(s);
        
        System.out.println();
        
        String str=String.join("-", v1);
        System.out.println(str);
	}
}












        //Collections.sort(v1);
        //Collections.sort(v1,Collections.reverseOrder());
        //Collections.reverse(v1);
