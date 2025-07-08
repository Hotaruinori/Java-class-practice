package Part2.Unit23_Collection.Map;
import java.util.*;

public class Map04
{
	public static void main(String[] args)
	{
        Map<Integer,String> map = new HashMap<>();
		map.put(1,"Lily");
        map.put(2,"Lulu");
        map.put(3,"Nana");
        map.put(4,"Jojo");
        map.put(5,"Anna");
		
	    Set<Integer> set = map.keySet();  //將key存入Set容器
	    
	    for(Integer s : set)
	    {
	        System.out.printf("%d = %s\n", s, map.get(s));
	    }  	    
    }
}
