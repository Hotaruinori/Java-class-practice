
import java.awt.*;
  
public class ShowPolygon extends Frame
{
   public void paint(Graphics g)
   {
      int x[]={74,95,250,159,88};	
      int y[]={84,105,90,210,177};	
      g.setColor(Color.YELLOW); 	//繪圖顏色設為黃色
      g.fillPolygon(x,y,5);     	//繪出多邊形
      g.setColor(Color.BLACK); 	    //繪圖顏色設為黑色
      g.drawPolygon(x,y,5);    	    //用黑色繪出多邊形
   }
   
   public static void main(String args[])
   {
      ShowPolygon frm=new ShowPolygon();
      frm.setTitle("多邊形");
      frm.setSize(300,250);
      frm.setLocation(350,250); 
      frm.setVisible(true); 
   }
}

