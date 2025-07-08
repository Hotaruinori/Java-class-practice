
import java.awt.*;

public class ShowImage2 extends Frame 
{ 
   public ShowImage2() 
   {    
      super("影像翻轉");
      setLocation(100,60);    
      setSize(630,500);
      setVisible(true);  
   }
    
   public void paint(Graphics g)
   {
      int x,y;
      Image image;
      image=Toolkit.getDefaultToolkit().getImage("mountain.jpg");
      x=10;y=50;
      g.drawImage(image,x,y,x+300,y+200,0,0,300,200,this); 
      
      x=150;y=280;
      g.drawImage(image,x,y,x+300,y+200,0,200,300,0,this); 
      
      x=320;y=50;
      g.drawImage(image,x,y,x+300,y+200,300,0,0,200,this); 
   }
   
   public static void main(String[] args) 
   {   
      ShowImage2 frame = new ShowImage2();     
   }
}

