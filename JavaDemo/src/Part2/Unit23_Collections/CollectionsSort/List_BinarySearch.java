
import java.util.*;

public class List_BinarySearch
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
        System.out.println("List元素: " + list);
        System.out.println();
      
        System.out.println("查詢Lulu -");
        System.out.println("回傳Lulu的索引值: " + Collections.binarySearch(list,"Lulu"));      
    }
}
