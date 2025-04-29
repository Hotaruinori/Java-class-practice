package Part2.Unit15_OO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import javax.imageio.ImageIO;
public class MyFrame extends Frame
{
   // 建立 Canvas 的內部類別
   public class MyCanvas extends Canvas {
      private BufferedImage image; // 宣告圖片變數

      public MyCanvas() {
       // 在建構子中載入圖片（只載入一次）
         try {
               image = ImageIO.read(new File("D:\\Projects\\Java Demo 1\\src\\Part2\\Unit15_OO\\dora.png"));
         } catch (IOException e) {
               System.out.println("圖片載入錯誤: " + e.getMessage());
               image = null; // 確保 image 為 null 如果載入失敗
         }
      }

      @Override
      public void paint(Graphics g) {
          super.paint(g); // 呼叫父類別的 paint 方法
          
          if (image != null) {
              g.drawImage(image, 100, 100, this); // 在(100,100)位置繪製圖片
          } else {
              g.setColor(Color.RED);
              g.drawString("圖片載入失敗", 100, 100);
          }
      }
   }
   public static void main(String[] args){
      MyFrame frm = new MyFrame();

      Color c = new Color(255, 255, 0);
      frm.setBackground(c);
      frm.setLocation(750, 200);
      frm.setTitle("Hello");
      frm.setSize(1280, 720);
      frm.setLayout(null); // 取消佈局管理器

      // 建立並添加畫布
      MyCanvas can = frm.new MyCanvas();
      can.setBounds(0, 0, 1280, 720); // 設定畫布大小（覆蓋整個視窗）
      frm.add(can); // 將畫布添加到視窗
      
      


      frm.setVisible(true);
	}
}
