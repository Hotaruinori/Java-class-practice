import java.awt.*;									// 匯入類別庫
import java.awt.event.*;
import javax.swing.*;
public class ch30_7 extends JPanel {				// JPanel類別			
	public void paintComponent(Graphics g) {		// 繪圖方法	
		super.paintComponent(g);					// 上層容器清除原先內容
		setBackground(Color.white);					// 畫布背景是白色
		g.setColor(Color.blue);						// 畫布是用藍色繪圖
		g.setFont(new Font("Arial",Font.ITALIC,18));	// 字型設定
		g.drawString("I love Java", 30, 30);		// 字串在(30,30)輸出
		g.setFont(new Font("Old English Text MT",Font.BOLD,20));// 字型設定
		g.drawString("I love Java", 150, 30);		// 字串在(150,30)輸出
		g.fillRect(30,50,180,120);					// 繪製矩形
	}	
	public static void main(String[] args) {
		JFrame frm = new JFrame("ch30_7");
		Container ct = frm.getContentPane();		// 內容窗格
		ct.add(new ch30_7());						// 將畫布載入內容窗格
		frm.setSize(300, 250);						// 寬200, 高160	
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);						// 顯示視窗
	}
}

