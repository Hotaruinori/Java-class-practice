
import java.awt.*;

class ShowOval extends Frame
{
   public void paint(Graphics g)
   {
      g.setColor(Color.BLUE);      
      g.fillOval(80,60,200,200);       
   }
   
   public static void main(String args[])
   {
      ShowOval frm=new ShowOval();
      frm.setTitle("橢圓形");
      frm.setSize(350,200);
      frm.setLocation(300,250);       
      frm.setVisible(true);  
   }
}

