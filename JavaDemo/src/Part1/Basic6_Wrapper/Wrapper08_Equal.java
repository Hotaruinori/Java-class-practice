package Part1.Basic6_Wrapper;
public class Wrapper08_Equal
{
    public static void main(String[] args)
    {
        //case 1 
        Integer ref1 = new Integer(100);  
        Integer ref2 = new Integer(100); 
        
        System.out.println(ref1.equals(ref2)); 
        System.out.println(ref1 == ref2);
        System.out.println();
      
        //case 2
        Integer ref3 = 100;  
        Integer ref4 = 100; 
        
        System.out.println(ref3.equals(ref4)); 
        System.out.println(ref3 == ref4); 
        System.out.println();
      
        //case 3
        Integer ref5 = 128;  
        Integer ref6 = 128;
      
        System.out.println(ref5.equals(ref6)); 
        System.out.println(ref5 == ref6); 
    }
}        