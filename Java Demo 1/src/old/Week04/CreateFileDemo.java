package Week04;
import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
    public static void main(String[] args) {


        File file1 = new File("D:\\Projects\\Java Demo 1\\src\\Week04\\abc\\zzz");
        // windows d:\abc  or   d:/abc  ->OK
        // linux /abc  ->OK
        // mac /abc  ->OK
        System.out.println("建立資料夾：" + file1.mkdirs());  // create folder-> true 
        System.out.println("是否存在 " + file1.exists());
        System.out.println("是否為資料夾 " + file1.isDirectory());

        try{
            File file2 = new File("D:\\Projects\\Java Demo 1\\src\\Week04\\abc\\123.txt");
            System.out.println("建立檔案：" + file2.createNewFile());
            System.out.println("是否存在 " +file2.exists());
            System.out.println("是否為檔案 " +file2.isFile());

        }catch(IOException e){
            System.out.println(e.toString());
        }


    }
}
