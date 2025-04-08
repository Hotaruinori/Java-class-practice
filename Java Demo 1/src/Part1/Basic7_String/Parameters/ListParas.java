package Part1.Basic7_String.Parameters;
public class ListParas
{
	public static void main(String[] args)
	{
	    if(args.length==0)
	    {
           System.out.printf("參數個數不符\n");
           System.exit(0);
        }
           
        System.out.println("參數個數:" + args.length);
        for(int x=0; x<args.length; x++)
        {
            System.out.printf("args[%d]=%s\n",x,args[x]);
        }    
	}
}
