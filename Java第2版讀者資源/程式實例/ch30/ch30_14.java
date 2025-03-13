import java.awt.*;									// 匯入類別庫
import javax.swing.*;
import java.awt.geom.*;
public class ch30_14 extends JPanel {				// JPanel類別	
	public void paintComponent(Graphics g) {		// 繪圖方法	
		Graphics2D g2d = (Graphics2D) g;
		super.paintComponent(g);					// 上層容器清除原先內容
		g2d.setPaint(new GradientPaint(50,150,Color.yellow,290,250,Color.red));							
		g2d.fill(new Rectangle2D.Float(50.0f,50.0f,240.0f,50.0f));	// 填充矩形
		
		g2d.setPaint(new GradientPaint(50,150,Color.green,290,250,Color.yellow));			
		g2d.fill(new Ellipse2D.Double(50.0d,150.0d,240.0d,100.0d));	// 填充橢圓	
	}	
	public static void main(String[] args) {
		JFrame frm = new JFrame("ch30_14");
		Container ct = frm.getContentPane();		// 內容窗格
		ct.add(new ch30_14(),BorderLayout.CENTER);	// 將畫布載入內容窗格
		frm.setSize(350, 300);						// 寬350, 高300	
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);						// 顯示視窗
	}
}

