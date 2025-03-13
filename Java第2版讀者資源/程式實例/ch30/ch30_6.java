import java.awt.*;									// 匯入類別庫
import javax.swing.*;
public class ch30_6 extends JPanel {				// JPanel類別			
	public void paintComponent(Graphics g) {		// 繪圖方法	
		super.paintComponent(g);					// 上層容器清除原先內容
		g.drawRect(5,5,100,100);					// 繪製矩形
	}	
	public static void main(String[] args) {
		JFrame frm = new JFrame("ch30_6");
		Container ct = frm.getContentPane();		// 內容窗格
		ct.add(new ch30_6());						// 將畫布載入內容窗格
		frm.setSize(200, 160);						// 寬200, 高160	
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);						// 顯示視窗
// 列出畫布寬度與高度
		System.out.println("畫布寬度 : " + ct.getWidth());
		System.out.println("畫布高度 : " + ct.getHeight());
	}
}

