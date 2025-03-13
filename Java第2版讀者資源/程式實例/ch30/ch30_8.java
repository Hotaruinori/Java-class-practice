import java.awt.*;									// 匯入類別庫
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class ch30_8 extends JPanel {				// JPanel類別			
	public void paintComponent(Graphics g) {		// 繪圖方法	
		super.paintComponent(g);					// 上層容器清除原先內容
		Random ran = new Random();					// 隨機數物件
		for ( int i = 0; i < 50; i++ ) {
			int x1 = ran.nextInt(620);				// (x1,y1)是矩形左上角座標
			int y1 = ran.nextInt(420);
			int x2 = ran.nextInt(620);				// (x1,y1)是矩形右下角座標
			int y2 = ran.nextInt(420);
			if (x1 > x2) {
				int tmp = x1; x1 = x2; x2 = tmp;
			}
			if (y1 > y2) {
				int tmp = y1; y1 = y2; y2 = tmp;
			}
			g.drawRect(x1,y1,(x2-x1),(y2-y1));		// 繪製矩形
		}	
	}	
	public static void main(String[] args) {
		JFrame frm = new JFrame("ch30_8");
		Container ct = frm.getContentPane();		// 內容窗格
		ct.add(new ch30_8());						// 將畫布載入內容窗格
		frm.setSize(640, 480);						// 寬640, 高480	
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);						// 顯示視窗
	}
}

