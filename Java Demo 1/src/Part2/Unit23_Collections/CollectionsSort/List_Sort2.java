
import java.util.*;

public class List_Sort2
{
    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>();
  
        list.add("Lily");  
        list.add("Lulu");
        list.add("Nana");
        list.add("Jojo");
        list.add("Diana");
        list.add("Anna");
      
        Collections.sort(list,new MyComparator());
            
        System.out.println("List¤¸¯À: " + list);          
    }
   
    static class MyComparator implements Comparator 
    {
        public int compare(Object o1,Object o2)
        {
            String name1=(String) o1;
            String name2=(String) o2;
            
            return name1.compareTo(name2);
        }    
    } 
}
