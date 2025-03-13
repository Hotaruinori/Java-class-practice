import java.awt.*;									// 匯入類別庫
import javax.swing.*;
public class ch30_11 extends JPanel {				// JPanel類別	
	public void paintComponent(Graphics g) {		// 繪圖方法	
		super.paintComponent(g);					// 上層容器清除原先內容
		g.setColor(Color.LIGHT_GRAY);				// 繪製淺灰色
		g.draw3DRect(50,50,100,50,false);			// 內凹
		g.draw3DRect(200,50,100,50,true);			// 外凸		
	}	
	public static void main(String[] args) {
		JFrame frm = new JFrame("ch30_11");
		Container ct = frm.getContentPane();		// 內容窗格
		ct.add(new ch30_11(),BorderLayout.CENTER);	// 將畫布載入內容窗格
		frm.setSize(350, 200);						// 寬350, 高200	
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);						// 顯示視窗
	}
}

