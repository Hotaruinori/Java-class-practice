package Week01;
public class InputArgs {

    public static void main(String[] args) {
        
        if(args.length> 0)
        {
            for(int i = 0; i < args.length; i++)
            {
                System.out.printf("args[%d] is %s\n", i, args[i]);
            }
        }
    }
}
