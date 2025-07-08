
import java.awt.*; 
 
public class ShowPolyline extends Frame
{
    public void paint(Graphics g)
    {
        int x[]={38,95,127,250,238};	
        int y[]={44,105,90,129,190};	
        g.setColor(Color.BLUE); 		
        g.drawPolyline(x,y,5);     	  
    }
    
    public static void main(String args[])
    {
        ShowPolyline frm=new ShowPolyline();
        frm.setTitle("連續線條");
        frm.setSize(300,250);
        frm.setLocation(350,250); 
        frm.setVisible(true); 
    }
}

