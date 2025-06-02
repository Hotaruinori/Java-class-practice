
import java.util.ArrayList;
import java.util.List;

public class StreamList3 
{
    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("5");
        list.add("4");
               
        System.out.println("Á`©M: " + list.stream().mapToInt(s -> Integer.valueOf(s)).sum());
        System.out.println();
        System.out.println("¥­§¡: " + list.stream().mapToInt(s -> Integer.valueOf(s)).average());
        System.out.println();
    }
}
