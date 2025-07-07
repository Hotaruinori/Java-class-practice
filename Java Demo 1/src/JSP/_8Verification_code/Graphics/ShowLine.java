
import java.awt.*;
 
public class ShowLine extends Frame
{
   public void paint(Graphics g)
   {
      g.setColor(Color.RED); 		
      g.drawLine(50,70,220,200);
      g.setColor(Color.BLUE);     
      g.drawLine(240,90,70,220);
   }
   
   public static void main(String[] args)
   {
      ShowLine frm=new ShowLine();
      frm.setTitle("線段");
      frm.setSize(300,250);
      frm.setLocation(350,250); 
      frm.setVisible(true); 
   }
}
