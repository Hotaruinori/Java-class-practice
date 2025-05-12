
import java.util.*;

public class List_Sort
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
      
  	    Collections.sort(list);
        //Collections.sort(list,Collections.reverseOrder());
        System.out.println("List¤¸¯À: " + list);
      
    }
}
