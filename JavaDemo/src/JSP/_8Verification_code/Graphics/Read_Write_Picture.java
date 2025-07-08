
//讀取圖片另存新檔

import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class Read_Write_Picture
{
    public static void main(String[] args) throws Exception
    {
        String path = "D:\\MyWeb\\eclipse\\workspace\\JSP08\\src\\main\\java\\mountain.jpg"; 
        BufferedImage image = ImageIO.read( new FileInputStream(path) );
        File output  = new File("D:\\MyWeb\\eclipse\\workspace\\JSP08\\src\\main\\java\\ok.gif"); 
        ImageIO.write(image, "gif",  output);
    }
}
