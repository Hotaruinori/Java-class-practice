package Part1.Basic6_Wrapper;
public class Wrapper07_AutoUnBox
{
    public static void main(String[] args)
    {
        Integer ref = 10;  
         
        int x = ref;      //Autounboxing

        System.out.println(x * 10);
            
        System.out.println(ref.intValue() * 10);   //Jdk5.0以前的寫法
            
        System.out.println(ref * 10);  //Jdk5.0以後的寫法      
    }
}         