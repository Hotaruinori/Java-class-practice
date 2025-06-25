package Week04;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputDemo {
    public static void main(String[] args) {

        try{
            FileInputStream filein = new FileInputStream("D:\\Projects\\Java Demo 1\\src\\Week04\\utf8.txt");
            byte[] buffer = new byte[2000];
            int length = 0;

            while (-1 != (length = filein.read(buffer, 0, 200))) {
                String str = new String(buffer, 0, length);
                System.out.println(str);
            }
            filein.close();
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try{
            FileOutputStream fileout = new FileOutputStream("D:\\Projects\\Java Demo 1\\src\\Week04\\utf8.txt");
              //FileOutputStream fileout = new FileOutputStream("d:/out.txt", true);
            String str = "Hello world";
            byte[] buffer = str.getBytes();
            fileout.write(buffer);
            fileout.close();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
