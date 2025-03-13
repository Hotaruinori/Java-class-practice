import javax.swing.*;								// 匯入類別庫
import java.awt.*;										
public class ch29_6 {	
	static JFrame jfrm = new JFrame("ch29_6");
	static JButton btn = new JButton("OK");
	static Container ct  = jfrm.getContentPane();	// 取得內容窗格物件
	static ImageIcon icon =  new ImageIcon("star.gif");
	static ImageIcon pressedIcon =  new ImageIcon("moon.gif");
	static ImageIcon rolloverIcon =  new ImageIcon("sun.gif");
	public static void main(String[] args) {
		ct.setLayout(new FlowLayout());				// 設定流動版面配置
		ct.add(btn);								// 在內容窗格建立按鈕
		btn.setIcon(icon);							// 按鈕有star.gif圖	
		btn.setPressedIcon(pressedIcon);			// 按鈕有moon.gif圖	
		btn.setRolloverIcon(rolloverIcon);			// 按鈕有sun.gif圖	
		jfrm.setSize(200, 160);						// 寬200, 高160
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// 顯示視窗
	}
}

