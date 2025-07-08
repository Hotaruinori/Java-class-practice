package ted;

import java.awt.*;
import java.awt.event.*;

public class ShowImage extends Frame 
{ 
    public ShowImage(String title) 
    {    
        super(title); 
        setSize(600,600);
        setLocation(380,150); 
        setVisible(true);
        addWindowListener(new WindowAdapter()      
          {public void windowClosing(WindowEvent e) 
          {System.exit(0);}});
   
    }
                                                 													  
    public void paint(Graphics g)
    {
        Image image;
        image=Toolkit.getDefaultToolkit().getImage("./picture/mountain.jpg");
        g.drawImage(image,10,50,this);  	         //顯示原圖尺寸300*200
        g.drawImage(image,10,280,150,100,this);    //顯示縮小圖
        g.drawImage(image,180,280,400,300,this);   //顯示放大圖
    }
   
}