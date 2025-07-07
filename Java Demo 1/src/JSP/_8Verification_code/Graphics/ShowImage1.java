
import java.awt.*;

public class ShowImage1 extends Frame 
{ 
   public ShowImage1() 
   {    
      super("影像放大與縮小");    
   }
   
   public void paint(Graphics g)
   {
      Image image;
      image=Toolkit.getDefaultToolkit().getImage("D:\\MyWeb\\eclipse\\workspace\\JSP08\\src\\main\\java\\mountain.jpg");
      g.drawImage(image,10,50,this);  	       //顯示原圖尺寸300*200
      g.drawImage(image,10,280,150,100,this);  //顯示縮小圖
      g.drawImage(image,180,280,400,300,this); //顯示放大圖
   }
   
   public static void main(String[] args)
   {   
      ShowImage1 frm = new ShowImage1();
      frm.setSize(600,600); 
      frm.setVisible(true);   
   }
}
