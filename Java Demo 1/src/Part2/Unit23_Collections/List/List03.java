
import java.util.*;

public class List03
{
	public static void main(String[] args)
	{
		List<String> v1 = new Vector<String>();
		v1.add("Lily");
		v1.add("Lulu");
		v1.add("Nana");
		v1.add("Diana");			
		System.out.println("取得Vector中所有元素:");
		System.out.println(v1);
		System.out.println();
        System.out.println("取得指定index==1的元素:");
		System.out.println(v1.get(1));
		System.out.println();
		
		System.out.println("Jojo插入Vector:");
        List<String> v2 = new Vector<>();
		v2.add("Lily");
		v2.add(0,"Jojo");
		v2.add("Lulu");
        v2.add("Nana");
        v2.add("Diana");  
		System.out.println(v2);		
	}
}
