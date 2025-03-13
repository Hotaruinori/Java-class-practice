import java.awt.*;									// 匯入類別庫
import javax.swing.*;
import java.awt.geom.*;
public class ch30_12 extends JPanel {				// JPanel類別	
	public void paintComponent(Graphics g) {		// 繪圖方法	
		Graphics2D g2d = (Graphics2D) g;
		super.paintComponent(g);					// 上層容器清除原先內容
		g2d.setColor(Color.red);					// 紅色
		Stroke stroke = new BasicStroke(3f);		// 線條寬度3f
		g2d.setStroke(stroke);
		g2d.drawLine(50,30,250,30);
		
		g2d.setColor(Color.green);					// 綠色
		g2d.setStroke(new BasicStroke(6f));			// 線條寬度6f
		g2d.draw(new Line2D.Float(50.0f,80.0f,250.0f,80.0f));
		
		g2d.setColor(Color.blue);					// 藍色
		g2d.setStroke(new BasicStroke(9f));			// 線條寬度9f
		g2d.draw(new Line2D.Double(50.0d,130.0d,250.0d,130.0d));				
	}	
	public static void main(String[] args) {
		JFrame frm = new JFrame("ch30_12");
		Container ct = frm.getContentPane();		// 內容窗格
		ct.add(new ch30_12(),BorderLayout.CENTER);	// 將畫布載入內容窗格
		frm.setSize(350, 200);						// 寬350, 高200	
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);						// 顯示視窗
	}
}

