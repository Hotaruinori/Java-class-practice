import java.awt.*;

class ShowRect extends Frame
{
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);      
        g.fillRect(80,60,200,110);
        //g.drawRoundRect(80,60,200,110,60,30);
    }
    
    public static void main(String[] args)
    {
        ShowRect frm=new ShowRect();
        frm.setTitle("矩形");
        frm.setSize(350,200);
        frm.setLocation(300,250);       
        frm.setVisible(true);  
    }
}

