package Part2.Unit20_FileIO.ByteStream;
import java.io.*;

public class EX13B_DataInputStream
{
    public static void main(String[] args) throws Exception
    {
        String file = "EX13.txt";
        File name = new File(file);
        char ch;
        int unit;
        double price;
        StringBuilder item;
        System.out.println("檔案路徑: " + name.getAbsolutePath());
        
        //建立DataInputStream的輸入串流物件
        DataInputStream input = new DataInputStream(
                                    new FileInputStream(name));
        try {
                                 
            while(true)
            {
                //讀取資料
                unit = input.readInt();
                price = input.readDouble();
                int item_num = input.readInt();
                item = new StringBuilder();
                for ( int i = 0; i < item_num; i++ ){
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
        catch(EOFException e){
        
           input.close();          //關閉串流
        }
    }
}
