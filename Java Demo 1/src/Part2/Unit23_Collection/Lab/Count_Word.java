// Lab 計算檔案中的英文單字出現次數
package Part2.Unit23_Collection.Lab;
import java.io.*;
import java.util.*;

public class Count_Word {
    public static void main (String[] args) throws Exception {
     	
        File file=new File("D:\\Projects\\Java Demo 1\\src\\Part2\\Unit23_Collection\\Lab\\song.txt");        //讀取文件
        Scanner input=new Scanner(file);
        Set songset=new TreeSet();
        String word;
        List<String> songlist = new ArrayList<>();
		while (input.hasNext()) {
            word = input.next().replaceAll("[^A-Za-z]", "");
            // if (word.contains(",")) {
            //    word = word.replace(",", ""); 
            // }
            // if (word.contains(".")) {
            //    word = word.replace(".", "");
            // }
            songlist.add(word);
            songset.add(word);
        }
        System.out.println(songset);

        for ( int i=0; i<songset.size(); i++) {
            int count=0;
            System.out.print(songset.toArray()[i]+ " ");
            for ( int j=0; j<songlist.size(); j++) {
                if (songset.toArray()[i].equals(songlist.toArray()[j])) {
                    count++;
                }
            }
            System.out.println("出現:" + count + "次");
        }
        

		 
		 
    }
}