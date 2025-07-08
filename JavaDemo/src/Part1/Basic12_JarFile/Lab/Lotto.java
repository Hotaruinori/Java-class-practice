
package Part1.Basic12_JarFile.Lab;
import java.util.Random;
import java.util.ArrayList;

public class Lotto
{
    public void getNumber(){
        ArrayList<Integer> num_list = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++){
            // int num = (int)(Math.random()*49+1); 
            Random rand = new Random();
            int num = rand.nextInt(49)+1;
            if (!num_list.contains(num)){
                num_list.add(num);
                System.out.println(num);
            }
            else{
                i--;
            }
        }
	}
	 
}        