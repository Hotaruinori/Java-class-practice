
import java.awt.*;
 
public class ShowArc extends Frame
{
   public void paint(Graphics g)
   {
      g.setColor(Color.blue);           //設定繪圖顏色為藍色
      g.fillArc(20,50,150,150,30,300);  //填滿圓弧
      g.setColor(Color.red);            //設定繪圖顏色為紅色
      for(int x=120;x<=360;x=x+60) 
      { 
         g.fillOval(x,100,50,50);       //繪出5個小圓
      }  
   }
   
   public static void main(String args[])
   {
      ShowArc frm=new ShowArc();
      frm.setTitle("圓弧與圓");
      frm.setSize(450,300);
      frm.setLocation(300,250);       
      frm.setVisible(true);  
   }
}
