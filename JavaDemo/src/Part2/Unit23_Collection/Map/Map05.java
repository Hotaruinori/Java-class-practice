//Map.Entry物件方法
package Part2.Unit23_Collection.Map;
import java.util.*;

public class Map05
{
	public static void main(String[] args)
	{
        Map<Integer,String> map = new HashMap<>();
		map.put(1,"Lily");
        map.put(2,"Lulu");
        map.put(3,"Nana");
        map.put(4,"Jojo");
        map.put(5,"Anna");
		//把map物件轉換為Set，Entry物件的集合
        Set<Map.Entry<Integer,String>> set=map.entrySet();
        
        for(Map.Entry<Integer,String> entry : set)
        {
            System.out.println("key=" + entry.getKey() + " value=" + entry.getValue());
        }
    }        
}
