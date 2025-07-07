
import java.awt.*;

public class SetClip extends Frame
{
    static SetClip frm=new SetClip();
  
    public static void main(String args[])
    {
        frm.setTitle("設定繪圖範圍");   
        frm.setSize(380,260);
        frm.setLocation(350,250);       
        frm.setVisible(true);  
    }

    public void paint(Graphics g)
    {
        g.setClip(35,40,320,200);
        for(int x=20;x<=340;x=x+20)
            for(int y=30;y<=240;y=y+20) 
            {
                int red=(int)(Math.random()*256);
                int green=(int)(Math.random()*256);
                int blue=(int)(Math.random()*256); 
                g.setColor(new Color(red,green,blue));
                g.fillOval(x,y,20,20);
            }
    }
}
