import java.awt.*;									// 匯入類別庫
import javax.swing.*;
import java.awt.geom.*;
public class ch30_13 extends JPanel {				// JPanel類別	
	public void paintComponent(Graphics g) {		// 繪圖方法	
		Graphics2D g2d = (Graphics2D) g;
		super.paintComponent(g);					// 上層容器清除原先內容
		g2d.setColor(Color.red);					// 紅色
		Stroke stroke = new BasicStroke(3f);		// 矩形線條寬度3f
		g2d.setStroke(stroke);
		g2d.drawRect(20,20,300,120);
		
		g2d.setColor(Color.green);					// 綠色
		g2d.setStroke(new BasicStroke(6f));			// 矩形線條寬度6f
		g2d.draw(new Rectangle2D.Float(50.0f,50.0f,240.0f,60.0f));
		
		g2d.setColor(Color.blue);					// 藍色
		g2d.setStroke(new BasicStroke(9f));			// 矩形線條寬度9f
		g2d.draw(new Rectangle2D.Double(70.0d,70.0d,190.0d,20.0d));		
	}	
	public static void main(String[] args) {
		JFrame frm = new JFrame("ch30_13");
		Container ct = frm.getContentPane();		// 內容窗格
		ct.add(new ch30_13(),BorderLayout.CENTER);	// 將畫布載入內容窗格
		frm.setSize(350, 200);						// 寬350, 高200	
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);						// 顯示視窗
	}
}

