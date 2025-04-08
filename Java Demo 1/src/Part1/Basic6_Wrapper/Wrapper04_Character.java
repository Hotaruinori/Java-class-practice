package Part1.Basic6_Wrapper;
public class Wrapper04_Character
{
    public static void main(String[] args)
	{
	    //裝箱
	    char c='P';
        Character oo1=new Character(c);
        Character oo2=new Character('Q');
       
        //拆箱      
        char ch1=oo1.charValue();
        char ch2=oo2.charValue();
      
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println();
       
        System.out.println(Character.getNumericValue('0')*3);
        System.out.println(Character.getNumericValue('2')*3);
        System.out.println(Character.getNumericValue('4')*3);
        System.out.println(Character.getNumericValue('6')*3);
        System.out.println(Character.getNumericValue('8')*3);
        System.out.println();
        System.out.println(Character.getNumericValue('A')*3);
        System.out.println(Character.getNumericValue('E')*3);
        System.out.println(Character.getNumericValue('Z')*3);
        System.out.println(Character.getNumericValue('a')*3);
        System.out.println(Character.getNumericValue('e')*3);
        System.out.println(Character.getNumericValue('z')*3);      
    }
}