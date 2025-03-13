import java.awt.*;									// 匯入類別庫
import javax.swing.*;
public class ch30_9 extends JPanel {				// JPanel類別	
	private Image bgImage = Toolkit.getDefaultToolkit().getImage("snow.jpg");
	public void paintComponent(Graphics g) {		// 繪圖方法	
		super.paintComponent(g);					// 上層容器清除原先內容
		g.drawImage(bgImage,0,0,this);				// 將圖片載入	
	}	
	public static void main(String[] args) {
		JFrame frm = new JFrame("ch30_9");
		Container ct = frm.getContentPane();		// 內容窗格
		ct.add(new ch30_9(), BorderLayout.CENTER);	// 將畫布載入內容窗格
		frm.setSize(640, 480);						// 寬640, 高480	
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);						// 顯示視窗
	}
}

