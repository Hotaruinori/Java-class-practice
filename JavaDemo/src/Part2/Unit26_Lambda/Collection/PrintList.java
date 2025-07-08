
import java.util.*;

public class PrintList
{
	public static void main(String[] args)
	{
        Vector<String> v1 = new Vector<>();
		v1.add("Lily");
		v1.add("Lulu");
		v1.add("Nana");
		v1.add("Diana");
		v1.add("Anna");
		
        for(String s : v1)
        {           
            System.out.println(s);
        } 
        System.out.println();
        /*===============================================*/
        
        v1.forEach((String s) -> System.out.printf("%-6s",s));
        System.out.println();
    }
}
