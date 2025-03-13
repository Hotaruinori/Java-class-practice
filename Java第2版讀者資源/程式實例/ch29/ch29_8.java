import javax.swing.*;								// 匯入類別庫
import java.awt.*;										
public class ch29_8 {	
	static JFrame jfrm = new JFrame("ch29_8");
	static Container ct  = jfrm.getContentPane();	// 取得內容窗格物件
	static JLabel lab = new JLabel();				// 定義標籤		
// 定義按鈕圖示和按鈕
	static ImageIcon arrowLeft =  new ImageIcon("arrowleft.gif");
	static ImageIcon arrowRight =  new ImageIcon("arrowright.gif");	
	static JButton btn1 = new JButton("Prev", arrowLeft);	// 往前
	static JButton btn2 = new JButton("Next", arrowRight);	// 往後	
	public static void main(String[] args) {
		ct.setLayout(new FlowLayout());				// 設定流動版面配置		
// 設定標籤和圖示
		ImageIcon labfig = new ImageIcon("snow0.jpg");	// 用在標籤的圖示
		lab.setIcon(labfig);							// 預設顯示圖示
		lab.setText("snow0.jpg");
		lab.setHorizontalTextPosition(JLabel.CENTER);	// 標籤顯示圖示水平中央
		lab.setVerticalTextPosition(JLabel.TOP);		// 標籤顯示圖示垂直上方	
// 設定功能紐btn2的Next字串放在圖示的左邊
		btn2.setHorizontalTextPosition(JButton.LEFT);	// 在Next字串右邊放圖示
// 將元件放入內容窗格		
		ct.add(lab);								// 在內容窗格建立標籤
		ct.add(btn1);								// 在內容窗格建立按鈕
		ct.add(btn2);								// 在內容窗格建立按鈕
// 設定視窗大小和可以顯示與結束程式					
		jfrm.setSize(800, 580);						// 寬800, 高580
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// 顯示視窗
	}
}

