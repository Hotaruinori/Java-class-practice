
import java.util.*;

public class PrintMap
{
	public static void main(String[] args)
	{
		Map<Integer,String> map = new TreeMap<>();
		map.put(new Integer(2), "Lily");
		map.put(new Integer(2), "Lulu");
		map.put(new Integer(3), "Nana");
		map.put(new Integer(1), "jojo");
		
		//System.out.println(map);
		
		Set<Integer> keyset=map.keySet();
        System.out.println("全部集合元素:");
        for(Integer s: keyset)
        {
            System.out.println(s + ":" + map.get(s));
        }    
	
        System.out.println("\n\n使用Lambda:");
        
        map.forEach((k,v) -> System.out.println(k + ":" + v));
           
	}
}
