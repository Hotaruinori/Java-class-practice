
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;
import javax.imageio.*;

public class Lab1_SaveGraphic_OK
{
   public static void main(String[] args) throws IOException
   {
      BufferedImage image=new BufferedImage(350,200,BufferedImage.TYPE_INT_RGB);
      Graphics g=image.getGraphics();
      ArrayList<Color> list=new ArrayList<>();
      list.add(Color.BLUE);
      list.add(Color.CYAN);
      list.add(Color.RED);
      list.add(Color.YELLOW);
      
      g.setColor(Color.WHITE);
      g.fillRect(0,0,350,200);
      //g.setColor(Color.YELLOW);
      //int c=0;           
      for(int x=0;x<=3;x++){
         
          g.setColor(list.get(x));          
          g.fillOval(40+70*x,80,60,60);        //繪出4個小圓
      }
      g.dispose();
          
      FileOutputStream file = new FileOutputStream("test.jpg");
      ImageIO.write(image, "JPEG", file);    
      file.close();
      System.out.println("存檔完成!");
   }
}
