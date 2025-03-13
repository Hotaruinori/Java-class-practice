import java.awt.*;									// 匯入類別庫
import javax.swing.*;
import java.awt.geom.*;
public class ch30_12_1 extends JPanel {				// JPanel類別	
	public void paintComponent(Graphics g) {		// 繪圖方法	
		Graphics2D g2d = (Graphics2D) g;
		super.paintComponent(g);					// 上層容器清除原先內容
		g2d.setColor(Color.red);					// 紅色
		float[] dashPattern1 = {5f,5f};				// 虛線樣式
		Stroke stroke1 = new BasicStroke(3f,BasicStroke.CAP_BUTT,
				BasicStroke.JOIN_MITER,1.0f,dashPattern1,0.0f);
		g2d.setStroke(stroke1);
		g2d.drawLine(50,30,250,30);
		
		g2d.setColor(Color.green);					// 綠色
		float[] dashPattern2 = {10f,3f};			// 虛線樣式
		Stroke stroke2 = new BasicStroke(3f,BasicStroke.CAP_BUTT,
				BasicStroke.JOIN_MITER,1.0f,dashPattern2,0.0f);
		g2d.setStroke(stroke2);						
		g2d.draw(new Line2D.Float(50.0f,80.0f,250.0f,80.0f));
		
		g2d.setColor(Color.blue);					// 藍色
		float[] dashPattern3 = {10f,3f,3f,3f};		// 虛線樣式
		Stroke stroke3 = new BasicStroke(3f,BasicStroke.CAP_BUTT,
				BasicStroke.JOIN_MITER,1.0f,dashPattern3,0.0f);
		g2d.setStroke(stroke3);	
		g2d.draw(new Line2D.Double(50.0d,130.0d,250.0d,130.0d));				
	}	
	public static void main(String[] args) {
		JFrame frm = new JFrame("ch30_12_1");
		Container ct = frm.getContentPane();		// 內容窗格
		ct.add(new ch30_12_1(),BorderLayout.CENTER);	// 將畫布載入內容窗格
		frm.setSize(350, 200);						// 寬350, 高200	
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);						// 顯示視窗
	}
}

