package Part2.Unit19_InnerClass.Anonymous;
import java.awt.*;
import java.awt.event.*;

public class AnonymousInnerC
{
    static Frame frm=new Frame("AWT program"); 
        
    public static void main(String[] args)
  	{
      	frm.setSize(400,350);            
      	frm.setBackground(Color.yellow);
      	frm.setLocation(250,200);         
      	frm.setVisible(true);
      
      	frm.addWindowListener(
         	new WindowAdapter(){ 
            	public void windowClosing(WindowEvent e){ 
                	System.exit(0);
            	}
         	}
      	);      	        
   }
   
}