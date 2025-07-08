package Part2.Unit23_Collection.List;
import java.util.*;

public class List05
{
   public static void main(String[] args) 
   {
      List<String> list = new ArrayList<>();
      String target = "Diana";
      list.add("Lily");  
      list.add("Lulu");
      list.add("Nana");
      list.add("Jojo");
  
      System.out.println("容器內的元素: " + list);
      System.out.println("元素個數:" + list.size());
      System.out.println("插入的元素:" + target);
  
      list.add(2, target);
      System.out.println("\n");
      System.out.println("顯示容器內的所有元素\n");
      
      System.out.println("方式1:for");     
      for( int i = 0; i < list.size(); i++ )
      {
         System.out.print(list.get(i)+ '\t');
      }   
      System.out.println();
      
      System.out.println("\n方式2:Enhance for");
      for( String element : list )
      {
         System.out.print(element + '\t');
      }   
      System.out.println("\n");

      System.out.println("搜尋: " + target);
      System.out.println("indexOf():" + list.indexOf(target));
      System.out.println("lastIndexOf():" + list.lastIndexOf(target));
      
      list.set(3, "Anna");
      System.out.println("\n取代元素3: " + list);
      
      list.remove(0);
      System.out.println("刪除元素0: " + list);
   }
}
