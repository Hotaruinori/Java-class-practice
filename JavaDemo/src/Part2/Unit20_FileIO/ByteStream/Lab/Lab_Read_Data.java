// 讀取data.dat的內容
package Part2.Unit20_FileIO.ByteStream.Lab;
import java.io.*;

public class Lab_Read_Data{
    public static void main(String[] args) throws Exception{
        String file = ("D:\\Projects\\Java Demo 1\\src\\Part2\\Unit20_FileIO\\ByteStream\\Lab\\data.dat");
        File name = new File(file);
        char ch;
        int unit;
        double price;
        StringBuilder item;
        System.out.println("檔案路徑: " + name.getAbsolutePath());
        
        DataInputStream input = new DataInputStream(new FileInputStream(name));
        try {
            while(true){
                unit = input.readInt();
                price = input.readDouble();
                int len = input.readInt();
                item = new StringBuilder();
                for ( int i = 0; i < len; i++ ){
                    ch = input.readChar();
                    item.append(ch);
                } 
                
                // String str = new String(item); 
                
                System.out.println("數量: " + unit);
                System.out.println("單價: " + price);
                System.out.println("名稱: " + item);
                System.out.println();
                //清空StringBuilder
                item.setLength(0);  
            }
        }
        catch (IOException e) {
           
        }
    }
}
