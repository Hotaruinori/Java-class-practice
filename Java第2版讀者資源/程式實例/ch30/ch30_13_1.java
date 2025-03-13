import java.awt.*;									// 匯入類別庫
import javax.swing.*;
import java.awt.geom.*;
public class ch30_13_1 extends JPanel {				// JPanel類別	
	private Image bgImage = Toolkit.getDefaultToolkit().getImage("star.gif");
	public void paintComponent(Graphics g) {		// 繪圖方法	
		super.paintComponent(g);					// 上層容器清除原先內容
		Graphics2D g2d = (Graphics2D) g;							
		g2d.drawImage(bgImage,0,0,this);			// 第一次圖片載入
// 圖像位移
		AffineTransform transform = new AffineTransform();	// 定義物件
		int bgImageWidth = bgImage.getWidth(this);			// 圖的寬
		int bgImageHeight = bgImage.getHeight(this);		// 圖的高
		int x = 100;
		int y = 100;
		transform.translate(x-bgImageWidth/2, y-bgImageHeight/2);
		g2d.drawImage(bgImage,transform,this);		// 第二次圖片載入
// 圖像位移與旋轉
		for (int i = 0; i < 5; i++ ) {
			transform.translate(100,30);			// 位移
			transform.rotate(Math.toRadians(15),bgImageWidth/2,bgImageHeight/2);
			transform.scale(0.85,0.85);				// 縮小至85%
			g2d.drawImage(bgImage,transform,this);	// 迴圈圖片載入
		}
	}	
	public static void main(String[] args) {
		JFrame frm = new JFrame("ch30_13_1");
		Container ct = frm.getContentPane();		// 內容窗格
		ct.add(new ch30_13_1(), BorderLayout.CENTER);	// 將畫布載入內容窗格
		frm.setSize(640, 400);						// 寬640, 高400	
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);						// 顯示視窗
	}
}

