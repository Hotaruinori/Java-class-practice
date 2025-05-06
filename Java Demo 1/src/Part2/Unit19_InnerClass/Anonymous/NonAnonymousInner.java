package Part2.Unit19_InnerClass.Anonymous;
import java.awt.*;
import java.awt.event.*;

public class NonAnonymousInner
{
    static Frame frm=new Frame("未使用匿名內部類別"); 
      
    public static void main(String args[])
    {
        frm.setSize(400,350);                
        frm.setBackground(Color.CYAN); 
        frm.setLocation(250,200);         
        frm.setVisible(true); 
                  
        frm.addWindowListener(new MyListener());
    }
}

class MyListener implements WindowListener
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
        
	public void windowActivated(WindowEvent e){}  
    public void windowDeactivated(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}   
}     