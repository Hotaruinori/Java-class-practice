
import java.awt.*;

class Show3DRect extends Frame
{
   public void paint(Graphics g)
   {
      g.setColor(Color.lightGray);      
      g.draw3DRect(80,60,200,110,true);
   }
   
   public static void main(String args[])
   {
      Show3DRect frm=new Show3DRect();
      frm.setTitle("3D矩形");
      frm.setSize(350,200);
      frm.setLocation(300,250); 
      frm.setBackground(Color.lightGray);      
      frm.setVisible(true);  
   }
}
