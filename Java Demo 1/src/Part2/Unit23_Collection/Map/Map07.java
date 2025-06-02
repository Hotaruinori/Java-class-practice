// 輸出 Map
import java.util.*;

public class Map07
{
	public static void main(String[] args)
	{
        Map<String, String> map = new TreeMap<>();    
        map.put("key1", "Lily");    
        map.put("key2", "Lulu");    
        map.put("key3", "Nana");
        map.put("key4", "Jojo");
        map.put("key5", "Anna");
        map.put("key6", "Diana");
        
        //方式1：    
        System.out.println("以 Map物件.keySet 取得 key和value：");    
        for(String key : map.keySet()) 
        {    
            System.out.println("key= "+ key + " and value= " + map.get(key));    
        }    
        System.out.println();
        
        
        //方式2    
        System.out.println("以 Map物件.entrySet 使用 iterator 取得 key和value：");
        Set<Map.Entry<String, String>> set =  map.entrySet();        
        Iterator<Map.Entry<String, String>> it = set.iterator();
        
        //Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            
        while(it.hasNext()) 
        {    
            Map.Entry<String, String> entry = it.next();    
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());    
        }
        System.out.println();    
      
        
        //方式3：    
        System.out.println("以 Map物件.entrySet 取得 key和value");  
        for(Map.Entry<String, String> entry : map.entrySet()) 
        {    
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());    
        }    
        System.out.println();
        
        
        //方式4    
        System.out.println("以 Map物件.values() 取得 所有的value，但不能取得 key");    
        for(String v : map.values()) 
        {    
            System.out.println("value= " + v);    
        } 
    }
}
