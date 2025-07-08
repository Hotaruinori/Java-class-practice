package ted;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import java.io.IOException;

public class ShowImage_ad extends Frame { 
    public ShowImage_ad(String title) 
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
        Image image = null;
        // InputStream input = getClass().getClassLoader().getResourceAsStream("picture/mountain.jpg");
        InputStream input = getClass().getResourceAsStream("/picture/mountain.jpg");
        if (input != null){ 
            try { 
                image = ImageIO.read(input);
            }
            catch (IOException e) {
                System.out.println("NO image");
            }
            g.drawImage(image,10,50,this);  	         //show origin size 300*200
            g.drawImage(image,10,280,150,100,this);    //show small size
            g.drawImage(image,180,280,400,300,this);   //show big size
        }
    }
}