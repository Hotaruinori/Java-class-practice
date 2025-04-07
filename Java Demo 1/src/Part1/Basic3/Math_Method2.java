package Part1.Basic3;
import java.util.Random;

public class Math_Method2
{ 
    public static void main(String[] args) 
    {
    	int no;
        System.out.println("嚙衛潘蕭random(): " + Math.random());
        
        for(int x=1 ;x<=6 ;x++)
        {        
           no = (int)(Math.random()*49 + 1);     // 1-49嚙踝蕭嚙衛潘蕭
           System.out.println("1-49嚙衛潘蕭: " + no);
        }
        System.out.print("\n\n");
        
        
        Random oo = new Random();
        for(int x=1 ;x<=6 ;x++)
        {        
           no = oo.nextInt(49) + 1;     // 1-49嚙踝蕭嚙衛潘蕭
           System.out.println("1-49嚙衛潘蕭: " + no);
        }
        System.out.println();
    }
}
