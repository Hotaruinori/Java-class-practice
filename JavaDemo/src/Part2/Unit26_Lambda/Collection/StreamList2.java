// stream¹Bºâ

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamList2 
{
    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("5");
        list.add("4");
        list.add("0");
        
        List<String> list2 = list.stream().filter(s -> Integer.valueOf(s) < 4)             
                                 .collect(Collectors.toList());
                                 
        list2.add("7");
        list2.forEach(s -> System.out.println(s));                         
    }
}
