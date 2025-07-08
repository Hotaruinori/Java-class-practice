
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class Basic_SaveGraphic_OK
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream input = new FileInputStream("mountain.jpg");
        BufferedImage image=ImageIO.read(input);
                  
        FileOutputStream output  = new FileOutputStream("ok.png");

        ImageIO.write(image, "PNG", output);    
        output.close();
        System.out.println("存檔完成!");
   }
}
