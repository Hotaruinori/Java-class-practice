
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;

import javax.imageio.ImageIO;

class Lab1 extends Frame{
   public void paint(Graphics g){	
	   
	  super.paint(g);  // 確保父類別也繪製
	  //背景
	  Color White = new Color ( 255, 255, 255 );
      g.setColor(White);      
      g.fillRect(0,0,350,200);
      //繪製文字
      String message = "300X200 JPG";
      Font font = new Font("標楷體", Font.BOLD, 28);
      g.setFont(font);
      g.setColor(Color.RED);
      g.drawString(message, 90, 70);
      //圈圈
      g.setColor(Color.BLUE);   
      g.fillOval(40,80,60,60);
      Color LightBlue = new Color ( 0, 255, 255 );
      g.setColor(LightBlue);   
      g.fillOval(110,80,60,60);
      g.setColor(Color.RED);   
      g.fillOval(180,80,60,60);
      g.setColor(Color.YELLOW);   
      g.fillOval(250,80,60,60);
      //記得釋放
      g.dispose();
  
   }
   
   public static void main(String args[])
   {
	  Lab1 frm=new Lab1();
      frm.setTitle("圓圈圈");
      frm.setSize(350,200);
      frm.setLocation(300,250);       
      frm.setVisible(true);  
      
      try {
      // 等待視窗渲染完成（可調整延遲時間）
//      Thread.sleep(500);
      
      // 擷取畫面並存檔
      BufferedImage image = frm.captureScreen();
      File output  = new File("D:\\MyWeb\\eclipse\\workspace\\JSP08\\src\\main\\java\\lab.gif"); 
      ImageIO.write(image, "gif",  output);
      System.out.println("已儲存圖片");
      }catch (Exception e) {
          e.printStackTrace();
      }
   }
   
   
   // 新增方法：將 Frame 內容轉為 BufferedImage
   public BufferedImage captureScreen() {
       BufferedImage image = new BufferedImage(
           getWidth(), 
           getHeight(), 
           BufferedImage.TYPE_INT_RGB
       );
       Graphics g = image.getGraphics();
       paint(g); // 手動呼叫 paint 方法繪製內容
       g.dispose();
       return image;
   }
}


